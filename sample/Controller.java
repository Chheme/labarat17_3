package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button buttonOnE;

    @FXML
    private Button buttonTo;

    @FXML
    private Button buttonThr;

    @FXML
    private Label LlForButtons;

    @FXML
    private void CLCKBUTTON1(ActionEvent eventOne) {LlForButtons.setText("Clicked Button1");}

    @FXML
    private void CLCKBUTTON2(ActionEvent eventTwo) {LlForButtons.setText("Clicked Button2");}

    @FXML
    private void CLCKBUTTON3(ActionEvent eventThree) {LlForButtons.setText("Clicked Button3");}
}
