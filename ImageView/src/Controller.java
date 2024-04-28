import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Button myButton;

    @FXML
    private ImageView myImageView;

    Image myImage = new Image(getClass().getResourceAsStream("panther2.png"));

    public void displayImage(){
        myImageView.setImage(myImage);
    }

}
