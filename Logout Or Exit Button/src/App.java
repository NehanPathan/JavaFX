import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));

            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void logout(Stage stage) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You're successfully logged out!");
            stage.close();

        }
    }
}
