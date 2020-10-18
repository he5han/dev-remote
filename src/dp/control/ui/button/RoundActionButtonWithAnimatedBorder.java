package dp.control.ui.button;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;

public class RoundActionButtonWithAnimatedBorder extends RoundButtonWithAnimatedBorder {
    public RoundActionButtonWithAnimatedBorder(Node node, Color borderColor) {
        super(node, borderColor, 13.0);
    }

    @Override
    public ObservableList<Node> getChildren() {
        return super.getChildren();
    }
}
