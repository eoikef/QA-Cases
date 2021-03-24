package stepDefinition;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.CalculatorScreen;

public class AddictionSteps {
    CalculatorScreen calculator = new CalculatorScreen();

    @Dado("^que estou na tela home$")
    public void que_estou_na_tela_home() throws Throwable {
        calculator.isinHomeScreen();

    }

    @Quando("^faço a conta quatro\\+dois$")
    public void faço_a_conta_quatro_dois() throws Throwable {
        calculator.clickbtnFour();
        calculator.clickbtnPlus();
        calculator.clickbtnTwo();
        calculator.clickbtnEqual();
    }

    @Então("^vejo resultado=seis$")
    public void vejo_resultado_seis() throws Throwable {
        calculator.checkAddiction();

    }


}
