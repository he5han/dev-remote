package dp.control.ui.ornaments;

import javafx.scene.layout.Pane;

public class Spacer extends Pane {
    public Spacer(double minWidth, double minHeight) {
        this.setMinSize(minWidth, minHeight);
    }

    public static Spacer vertical(double size){
        return new Spacer(0, size);
    }

    public static Spacer horizontal(double size){
        return new Spacer(size, 0);
    }
}
