import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

    @FXML
    private Label nameLable;

    public void displayName(String userName){
        nameLable.setText("Hello : " + userName);
    }

}
