import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Sphere;

public class Controller {

    @FXML
    private Sphere mySphere;
    private double x;
    private double y;

    
    @FXML
    void up(ActionEvent event) {
    mySphere.setTranslateY(y -= 10);

    }

    @FXML
    void down(ActionEvent event) {
        mySphere.setTranslateY(y+=10);
    }

    @FXML
    void left(ActionEvent event) {
        mySphere.setTranslateX(x-=10);

    }

    @FXML
    void right(ActionEvent event) {
        mySphere.setTranslateX(x+=10);

    }


}
