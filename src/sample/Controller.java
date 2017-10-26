package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textfield;
    public Label label;

    public void handleClick(ActionEvent actionEvent) {
        textfield.setText("Kliknięto.");
    }

}

