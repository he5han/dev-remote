package dp;

import dp.control.util.DraggableScene;
import dp.control.util.MainArgContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.List;

public class Main extends Application {
    public Main() {
        Application.setUserAgentStylesheet("dp/main.css");
    }

    public static void main(String[] args) {
        MainArgContext.init(List.of(args));
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setTitle("DEV PANEL");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(true);

        Scene scene = new DraggableScene(new Scene(root), primaryStage).getScene();
        scene.setFill(Color.TRANSPARENT);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}