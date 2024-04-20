import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("Logo.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Demo Title");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You Can't Escape Unless You Press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();
    }
}
