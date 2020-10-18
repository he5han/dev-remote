package dp;

import dp.control.ui.button.RoundActionButtonWithAnimatedBorder;
import dp.control.services.action.RunnableShellAction;
import dp.control.services.extension.ActionExtension;
import dp.control.ui.ornaments.Separator;
import dp.control.ui.ornaments.Spacer;
import dp.control.util.MainArgContext;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    HBox action_container;

    private void onClick(MouseEvent mouseEvent, RunnableShellAction action) throws IOException, InterruptedException {
        action.Run();
    }

    public void onClick(MouseEvent actionEvent) {
        Runtime.getRuntime().exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            ActionExtension<RunnableShellAction> extension =
                    ActionExtension.fromList(MainArgContext.getInstance().getArgs());

            for (RunnableShellAction action : extension.getParts()) {
                RoundActionButtonWithAnimatedBorder roundActionButtonWithAnimatedBorder =
                        new RoundActionButtonWithAnimatedBorder(
                                new Circle(11),
                                Color.RED
                        );
                roundActionButtonWithAnimatedBorder.setOnMousePressed((MouseEvent event) -> {
                    try {
                        this.onClick(event, action);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                roundActionButtonWithAnimatedBorder.getStyleClass().add("action-button");
                action_container.getChildren().add(Spacer.horizontal(5));
                action_container.getChildren().add(Separator.dotSeparator());
                action_container.getChildren().add(Spacer.horizontal(5));
                action_container.getChildren().add(roundActionButtonWithAnimatedBorder);
            }
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
