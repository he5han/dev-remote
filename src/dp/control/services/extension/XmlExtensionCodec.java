package dp.control.services.extension;

import dp.control.services.action.Action;

import java.util.Collections;
import java.util.List;

public class XmlExtensionCodec<T> {
    List<Action<T>> actions;
    final String url;

    public XmlExtensionCodec(String url) {
        this.url = url;
        this.actions = Collections.emptyList();
    }
}
