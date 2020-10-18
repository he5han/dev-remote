package dp;

import dp.control.services.action.Action;

import java.util.List;

public class Extension {
    public List<Action> actions;

    public Extension(List<Action> actions) {
        this.actions = actions;
    }

    public void addAction(Action action){
        this.actions.add(action);
    }
}
