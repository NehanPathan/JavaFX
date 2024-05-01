import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ToggleGroup food;

    @FXML
    private Label myLabel;

    @FXML
    private RadioButton rbutton1, rbutton2, rbutton3;

    @FXML
    void getFood(ActionEvent event) {
        if (rbutton1.isSelected())
            myLabel.setText(rbutton1.getText());
        else if (rbutton2.isSelected())
            myLabel.setText(rbutton2.getText());

        else if (rbutton3.isSelected())
            myLabel.setText(rbutton3.getText());

    }

}
