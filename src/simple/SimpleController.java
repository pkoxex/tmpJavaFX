
package simple;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {

    @FXML
    private Button myButton;

    @FXML
    void initialize() {
        myButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("That was easy, wasn't it?");
            }
        });
    }
}
