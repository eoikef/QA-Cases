package stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.home.HomePage;

public class HomeSteps {
    private final static HomePage homePage = new HomePage();

    @Dado("que estou na home")
    public void que_estou_na_home(){
        homePage.tvIsAtHome();
    }

    @Quando("clico em Sign In")
    public void clico_em_Sign_In() {
        homePage.clickBtnSignIn();
    }



}
