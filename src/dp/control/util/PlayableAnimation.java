package dp.control.util;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.beans.property.DoubleProperty;
import javafx.util.Duration;

public class PlayableAnimation extends PropertyAnimation implements CanPlay, CanReverse {

    public PlayableAnimation(DoubleProperty property) {
        super(
                new KeyFrame(Duration.millis(200), new KeyValue(property, 2, Interpolator.EASE_BOTH)),
                new KeyFrame(Duration.millis(500), new KeyValue(property, 0, Interpolator.EASE_BOTH)));
    }

    @Override
    public void play() {
        this.getTimeline().play();
    }

    @Override
    public void reverse() {
        this.getTimelineReverse().play();
    }
}
