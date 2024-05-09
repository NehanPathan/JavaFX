import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

    @FXML
    private TreeView<String> treeView;

    @FXML
    void selectItem() {
        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();

        if (item != null)
            System.out.println(item.getValue());

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        // TreeItem<String> rootItem = new TreeItem<>("Files");
        TreeItem<String> rootItem = new TreeItem<>("Files",new ImageView(new Image("folder.png")));

        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leafItem1 = new TreeItem<>("pic1");
        TreeItem<String> leafItem2 = new TreeItem<>("pic2");
        TreeItem<String> leafItem3 = new TreeItem<>("reel1");
        TreeItem<String> leafItem4 = new TreeItem<>("reel2");
        TreeItem<String> leafItem5 = new TreeItem<>("song1");
        TreeItem<String> leafItem6 = new TreeItem<>("song2");

        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

        treeView.setRoot(rootItem);
    }

}
