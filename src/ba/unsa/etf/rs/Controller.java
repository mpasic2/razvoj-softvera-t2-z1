package ba.unsa.etf.rs;

import javafx.event.ActionEvent;

public class Controller {
    public javafx.scene.control.Label helloWorld;
    public void buttonClick(ActionEvent actionEvent) {
        helloWorld.setText("hello world");
    }
}
