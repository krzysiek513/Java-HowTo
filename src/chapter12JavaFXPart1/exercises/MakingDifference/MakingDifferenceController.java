package chapter12JavaFXPart1.exercises.MakingDifference;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MakingDifferenceController {

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField BMITextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            Double weight = Double.valueOf(weightTextField.getText());
            Double height = Double.valueOf(heightTextField.getText());

            BMITextField.setText(String.valueOf(weight / (height * height)));
        }
        catch (NumberFormatException ex) {
            BMITextField.setText("Enter data");
            BMITextField.selectAll();
            BMITextField.requestFocus();
        }
    }

}
