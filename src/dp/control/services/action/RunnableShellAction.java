package dp.control.services.action;


import dp.control.util.Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnableShellAction extends Action<String> implements Runnable {

    public RunnableShellAction(String command) {
        super(command);
    }

    @Override
    public void Run() throws IOException, InterruptedException {
        Process pr = Runtime.getRuntime().exec(this.command);
        new Thread(() -> {

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;

            try {
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        pr.waitFor();
    }
}
