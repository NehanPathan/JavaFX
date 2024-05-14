import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primStage) throws Exception {
        // TODO Auto-generated method stub
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
            Parent root = loader.load();
            Controller controller = loader.getController();
            Scene scene = new Scene(root);

            // scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            // @Override
            // public void handle(KeyEvent event) {
            // switch (event.getCode()) {
            // case W:
            // controller.moveUp();
            // break;
            // case S:
            // controller.moveDown();
            // break;
            // case A:
            // controller.moveLeft();
            // break;
            // case D:
            // controller.moveRight();
            // break;

            // default:
            // break;
            // }
            // }

            // });
            scene.setOnKeyPressed(event -> {

                switch (event.getCode()) {
                    case W:
                        controller.moveUp();
                        break;
                    case S:
                        controller.moveDown();
                        break;
                    case A:
                        controller.moveLeft();
                        break;
                    case D:
                        controller.moveRight();
                        break;

                    default:
                        break;
                }

            });

            primStage.setScene(scene);
            primStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
