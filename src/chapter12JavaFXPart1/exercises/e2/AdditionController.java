package chapter12JavaFXPart1.exercises.e2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AdditionController {

    @FXML
    private TextField firstInteger;

    @FXML
    private TextField secondInteger;

    @FXML
    private TextField sum;

    @FXML
    void EqualButtonPressed(ActionEvent event) {
        String first = firstInteger.getText();
        String second = secondInteger.getText();

        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);

        int sumInt = firstInt + secondInt;
        String sumStr = String.valueOf(sumInt);
        String sumStr2 = String.valueOf(Integer.parseInt(firstInteger.getText())
                        + Integer.parseInt(secondInteger.getText()));
        sum.setText(sumStr2);
    }

}
