package dp.control.util;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

public class PropertyAnimation{
    public Timeline getTimeline() {
        return timeline;
    }

    public Timeline getTimelineReverse() {
        return timelineReverse;
    }

    private Timeline timeline;
    private Timeline timelineReverse;

    public PropertyAnimation(KeyFrame keyFrame, KeyFrame reverse) {
        this.timeline = new Timeline(keyFrame);
        this.timelineReverse = new Timeline(reverse);
    }
}
