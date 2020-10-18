package dp.control.ui.button;

import dp.control.util.SVGCloseIcon;
import javafx.scene.paint.Color;

public class RoundCloseButtonWithAnimatedBorder extends RoundButtonWithAnimatedBorder {
    public RoundCloseButtonWithAnimatedBorder() {
        super(new SVGCloseIcon(Color.WHITE), Color.DARKGRAY, 13.0);
    }
}
