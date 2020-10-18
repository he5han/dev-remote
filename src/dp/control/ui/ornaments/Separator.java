package dp.control.ui.ornaments;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Separator {
    public static DotSeparator dotSeparator() throws IOException {
        return new DotSeparator();
    }
}

class DotSeparator extends VBox {
    public DotSeparator() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../views/dot_separator.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }
}