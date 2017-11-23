
package intro;

import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Ch1_1 extends Application {

    @FXML
    Label label1;

    TextField myTextField;

    @FXML
    Button myButton;

    @FXML
    TextField mytextField;

    @FXML
    protected void handleButton(ActionEvent event) {
        label1.setText("NewLabelTitle");
        if (myTextField == null) {
            System.out.println("null");
            //myTextField.setText("wetrwertwertwert");
        }
        else {
            System.out.println("ok");
        }
        //System.out.println(myTextField.getText());
        //String input = myTextField.getText();
        //int intInput = Integer.parseInt(input);
        //System.out.println(intInput * 5);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("Tutorial1.fxml"));
        //loader.setController(this);
        //Parent root = loader.load();
        Parent root = FXMLLoader.load(getClass().getResource("Tutorial1.fxml"));
        Scene myScene = new Scene(root, 400, 400);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
