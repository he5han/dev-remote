package dp.control.util;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Window;

public class DraggableScene {
    private static double xOffset = 0;
    private static double yOffset = 0;

    private final Window window;
    private final Scene scene;

    Rectangle2D bounds;

    private double maxX = 0;
    private double minX = 0;

    public DraggableScene(Scene scene, Window window) {
        this.bounds = Screen.getPrimary().getBounds();
        this.window = window;
        this.scene = scene;
        this.setEvents();
    }

    public DraggableScene(Scene scene, Window window, Rectangle2D bounds) {
        this.window = window;
        this.bounds = bounds;
        this.scene = scene;
        this.setEvents();
    }

    private void onDrag(MouseEvent mouseEvent) {
        if(maxX > mouseEvent.getScreenX()) // Max bound
            if (mouseEvent.getScreenX() > minX) // Min bound
                window.setX(mouseEvent.getScreenX() + xOffset);
            else window.setX(0);
        else window.setX(maxX + xOffset);

        window.setY(mouseEvent.getScreenY() + yOffset);
    }

    private void setEvents(){
        this.scene.setOnMousePressed(this::onPressed);
        this.scene.setOnMouseDragged(this::onDrag);
    }

    private void onPressed(MouseEvent mouseEvent) {
        this.maxX = bounds.getWidth() - ( scene.getWidth() - mouseEvent.getSceneX() );
        this.minX = mouseEvent.getSceneX();

        xOffset = window.getX() - mouseEvent.getScreenX();
        yOffset = window.getY() - mouseEvent.getScreenY();
    }

    public Scene getScene() {
        return scene;
    }
}
