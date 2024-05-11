import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ToggleGroup myGroup;

    @FXML
    void newMethod(ActionEvent event) {
        System.out.println("You Selected The New MenuItem....");

    }

}
