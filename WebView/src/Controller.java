import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controller implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private WebView webView;

    private WebEngine engine;

    private WebHistory history;

    private String homepage;

    private double webZoom;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webView.getEngine();
        homepage = "www.google.com";
        textField.setText(homepage);
        webZoom = 1;
        loadPage(null);
    }

    public void loadPage(ActionEvent event) {
        // engine.load("http://www.google.com");
        engine.load("http://" + textField.getText());

    }

    public void refreshPage() {
        engine.reload();
    }

    public void zoomIn() {
        webZoom += 0.25;
        webView.setZoom(webZoom);
    }

    public void zoomOut() {
        webZoom -= 0.25;
        webView.setZoom(webZoom);

    }

    public void displayHistory() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();

        for (WebHistory.Entry entry : entries)
            // System.out.println(entry);
            System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
    }

    public void back() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());

    }

    public void forward() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());


    }

    public void executeJS(){
        engine.executeScript("window.location = \"https://www.youtube.com\";");
    }

}
