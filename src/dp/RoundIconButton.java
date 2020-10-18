package dp;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import dp.control.util.PlayableAnimation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

public class RoundIconButton extends StackPane implements Initializable {
    @FXML Circle circle;
    private double radius;
    private String command;
    private Color primaryColor = Color.ALICEBLUE;
    private final Runtime rt = Runtime.getRuntime();
    private PlayableAnimation playableAnimation;

    public RoundIconButton() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("round_icon_button.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    public void onHover(MouseEvent mouseEvent) {
        this.playableAnimation.play();
    }

    public void onExit(MouseEvent mouseEvent) {
        this.playableAnimation.reverse();
    }

    public void onClick(MouseEvent mouseEvent) throws IOException, InterruptedException {
        Process pr = rt.exec(this.command);
        new Thread(() -> {

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = null;

            try {
                while ((line = input.readLine()) != null)
                    System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        pr.waitFor();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
       this.circle.setRadius(radius);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Color getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(Color primaryColor) {
        this.circle.setStroke(primaryColor);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.playableAnimation = new PlayableAnimation(this.circle.strokeWidthProperty());
    }
}
