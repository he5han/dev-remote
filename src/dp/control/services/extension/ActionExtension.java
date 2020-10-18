package dp.control.services.extension;

import dp.control.services.action.RunnableShellAction;

import java.util.List;
import java.util.stream.Collectors;

public class ActionExtension<T> implements Extension<T> {

    private List<T> actions;

    public ActionExtension(List<T> actions) {
        this.actions = actions;
    }

    public static ActionExtension<RunnableShellAction> fromXml(String url) {
        XmlExtensionCodec codec = new XmlExtensionCodec(url);
        return new ActionExtension(codec.actions);
    }

    public static ActionExtension<RunnableShellAction> fromList(List<String> commands) {
        return new ActionExtension(commands.stream().map(command -> 
                new RunnableShellAction(command)).collect(Collectors.toList()));
    }

    @Override
    public List<T> getParts() {
        return actions;
    }
}
