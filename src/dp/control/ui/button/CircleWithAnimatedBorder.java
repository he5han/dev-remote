package dp.control.ui.button;

import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import dp.control.util.PlayableAnimation;

import java.net.URL;
import java.util.ResourceBundle;

class CircleWithAnimatedBorder extends Circle implements Initializable {
    private PlayableAnimation playableAnimation = new PlayableAnimation(this.strokeWidthProperty());
    public CircleWithAnimatedBorder(double radius, Paint stroke) {
        super(radius, Color.valueOf("#ffffff30"));
        this.setOnMouseEntered(this::onMouseEntered);
        this.setOnMouseExited(this::onMouseExited);
        this.setStrokeType(StrokeType.INSIDE);
        this.setStroke(stroke);
        this.setStrokeWidth(0);
    }

    private void onMouseExited(MouseEvent mouseEvent) {
        this.playableAnimation.reverse();
    }

    public void onMouseEntered(MouseEvent mouseEvent) {
        this.playableAnimation.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playableAnimation = new PlayableAnimation(this.strokeWidthProperty());
    }
}