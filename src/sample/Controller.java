package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class Controller {

    @FXML
    private TextField sendName;
    @FXML
    private TextField sendEmail;
    @FXML
    private TextField sendNumber;
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;
    @FXML
    public Label lbError;
    @FXML
    public Label lbRb1;
    @FXML
    public Label lbRb2;


    @FXML
    private void btConfimAction(ActionEvent actionEvent) {
        if (sendName.getText().equals("Vlad") && sendEmail.getText().equals("accurate@gmail.com") /*&& sendNumber.getText().equals("")*/) {
            lbError.setText("rabotaet");
            lbError.setTextFill(Color.GREEN);

        } else {
            lbError.setTextFill(Color.RED);
            lbError.setText("laja");

        }
    }

    @FXML
    private void rb1(ActionEvent actionEvent){



        /*if(rb1.isSelected()){
            lbRb1.setText("+5" + sendEmail);

        }*/
    }

    @FXML
    private void rb2(ActionEvent ae){
        lbRb1.setText("+380" + sendEmail);
    }


    public void rb1Action(ActionEvent actionEvent) {
        if(rb1.isSelected()){
            lbRb1.setText("+5");
            lbRb2.setText("");
        }
    }

    public void rb2Action(ActionEvent actionEvent) {
        if(rb2.isSelected()){
            lbRb2.setText("+380");
            lbRb1.setText("");
        }
    }
}
