import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Arc;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Controller implements Initializable{

    @FXML
    private Arc myShapeId;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Translate
        // TranslateTransition translate = new TranslateTransition();
        // translate.setNode(myShapeId);
        // translate.setDuration(Duration.millis(1000));
        // translate.setCycleCount(TranslateTransition.INDEFINITE);
        // translate.setByX(250);
        // translate.setByY(-250);
        // translate.setAutoReverse(true);
        // translate.play();

        //Rotate
        // RotateTransition rotate = new RotateTransition();
        // rotate.setNode(myShapeId);
        // rotate.setDuration(Duration.millis(1000));
        // rotate.setCycleCount(TranslateTransition.INDEFINITE);
        // rotate.setInterpolator(Interpolator.LINEAR);
        // rotate.setByAngle(360);
        // // rotate.setAxis(Rotate.X_AXIS);
        // // rotate.setAxis(Rotate.Y_AXIS);
        // rotate.setAxis(Rotate.Z_AXIS);//Default
        // rotate.play();

        // Fade
        // FadeTransition fade = new FadeTransition();
        // fade.setNode(myShapeId);
        // fade.setDuration(Duration.millis(1000));
        // fade.setCycleCount(TranslateTransition.INDEFINITE);
        // fade.setInterpolator(Interpolator.LINEAR);
        // fade.setFromValue(0);
        // fade.setToValue(1);
        //  fade.play();

        //Scale
        
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myShapeId);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(2.0);
        scale.setAutoReverse(true);
         scale.play();

    }

}
