package dp.control.ui.button;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class RoundButtonWithAnimatedBorder extends StackPane{

    public RoundButtonWithAnimatedBorder(Node node, Color borderColor) {
        super(new CircleWithAnimatedBorder(10, borderColor), node);
        this.initStack(node);
    }

    public RoundButtonWithAnimatedBorder(Node node, Color borderColor, Double radius) {
        super(new CircleWithAnimatedBorder(radius, borderColor), node);
        this.initStack(node);
    }

    private void initStack(Node node){
        node.setDisable(true);
    }
}