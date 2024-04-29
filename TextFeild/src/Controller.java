import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;

    int age;

    @FXML
    void onSubmit(ActionEvent event) {
        try {

            age = Integer.parseInt(myTextField.getText());

            if (age >= 18)
                myLabel.setText("You are now signed up!");
            else
                myLabel.setText("You must be 18+");

        } catch (NumberFormatException e) {
            myLabel.setText("Enter only number plz");

        } catch (Exception e) {
            myLabel.setText("error");

        }

    }

}
