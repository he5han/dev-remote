package dp.control.services.action;

public class Action<T> {
    final T command;

    public Action(T command) {
        this.command = command;
    }
}
