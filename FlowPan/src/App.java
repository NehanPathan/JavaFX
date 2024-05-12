import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }


    @Override
    public void start(Stage primStage) throws Exception {
        // TODO Auto-generated method stub
       try{
        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        
        Scene scene = new Scene(root);
        
        primStage.setScene(scene);
        primStage.show();
 
       } catch(Exception e){
        e.printStackTrace();
       }
    }
}
