package chapter12JavaFXPart1.exercises.e5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class MortgageCalculatorController {
    // formatters for currency and percentages
    private static final NumberFormat currency =
            NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent =
            NumberFormat.getPercentInstance();

    private BigDecimal loanDuration = new BigDecimal(20); // 10 default

    @FXML
    private TextField purchasePriceTextField;

    @FXML
    private TextField downPaymentTextField;

    @FXML
    private TextField interestRateTextField;

    @FXML
    private TextField loanAmountTextField;

    @FXML
    private TextField monthlyPaymentTextField;

    @FXML
    private TextField repaidAmountTextField;

    @FXML
    private Slider loadDurationSlider;

    @FXML
    private Label loadDurationLabel;

    // 12 * kwota = rokSplaty
    // roksplaty * loanDuration = repaidAmount
    // interestRate * purchasePrice + purchasePrice = repaidAmount
    // BigDecimal.valueOf(newValue.intValue() / 100.0);
    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            BigDecimal purchasePrice = new BigDecimal(purchasePriceTextField.getText());
            BigDecimal downPayment = new BigDecimal(downPaymentTextField.getText());
            BigDecimal interestRate = new BigDecimal(Double.valueOf(interestRateTextField.getText()) / 100);

            BigDecimal loanAmount = purchasePrice.subtract(downPayment);

            BigDecimal monthlyPayment = loanAmount.divide(loanDuration);

            BigDecimal repaidAmount = interestRate;

            loanAmountTextField.setText(currency.format(loanAmount));
            monthlyPaymentTextField.setText(currency.format(monthlyPayment));
            repaidAmountTextField.setText(currency.format(repaidAmount));
        }
        catch (NumberFormatException ex) {
            loanAmountTextField.setText("Enter amount");
            loanAmountTextField.selectAll();
            loanAmountTextField.requestFocus();
        }
    }
    // called by FXMLLoader to initialize the controller
    public void initialize() {
        // 0-4 rounds down, 5-9 rounds up
        currency.setRoundingMode(RoundingMode.HALF_UP);
        loadDurationLabel.setText(String.valueOf(loanDuration));
        // listener for changes to tipPercentageSlider's value
        loadDurationSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,
                                        Number oldValue, Number newValue) {
                        loanDuration =
                                BigDecimal.valueOf(newValue.intValue() * 10);
                        loadDurationLabel.setText(String.valueOf(loanDuration));
                    }
                }
        );
    }
}
