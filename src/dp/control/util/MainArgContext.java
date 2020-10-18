package dp.control.util;

import java.util.List;

public class MainArgContext {
    private static MainArgContext instance = null;
    private final List<String> args;

    public MainArgContext(List<String> args) {
        this.args = args;
    }

    public static MainArgContext getInstance() {
        if(instance == null) {
            throw new AssertionError("Instance not found");
        }

        return instance;
    }

    public synchronized static MainArgContext init(List<String> list) {
        if (instance != null)
        {
            throw new AssertionError("Already initialized");
        }

        instance = new MainArgContext(list);
        return instance;
    }

    public List<String> getArgs() {
        return args;
    }

}