package stepDefinition;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.CalculatorScreen;

public class SubtractionSteps {
    CalculatorScreen calculator = new CalculatorScreen();

    @Quando("^faço a conta quatro-dois$")
    public void faço_a_conta_quatro_dois() throws Throwable {
        calculator.clickbtnFour();
        calculator.clickbtnMinus();
        calculator.clickbtnTwo();
        calculator.clickbtnEqual();
    }

    @Então("^vejo resultado=dois$")
    public void vejo_resultado_dois() throws Throwable {
        calculator.checkSubtraction();
    }


}
