package stepDefinition;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.login.LoginPage;
import utils.ReadProperties;


public class LoginSteps {
    private final static LoginPage loginPage = new LoginPage();
    private final static HomeSteps homeSteps = new HomeSteps();
    private final static ReadProperties readProperties = new ReadProperties();


    @Então("vejo a tela de Login")
    public void vejo_a_tela_de_Login() {
        loginPage.tvIsAtLoginPage();
    }

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        homeSteps.que_estou_na_home();
        homeSteps.clico_em_Sign_In();
        vejo_a_tela_de_Login();
    }

    @Quando("faço login com email inválido")
    public void faço_login_com_email_inválido() {
        loginPage.fillEmail(readProperties.readValue("invalid_email"));
        loginPage.fillPassword(readProperties.readValue("user_password"));
        loginPage.clickBtnSignIn();
    }

    @Então("vejo aviso de erro")
    public void vejo_aviso_de_erro() {
        loginPage.tvIsAuthenticationError();
    }

    @Quando("faço login com email válido")
    public void faço_login_com_email_válido() {
        loginPage.fillEmail(readProperties.readValue("valid_email"));
        loginPage.fillPassword(readProperties.readValue("user_password"));
        loginPage.clickBtnSignIn();
    }

    @Então("vejo a tela de My Account")
    public void vejo_a_tela_de_My_Account() {
        loginPage.tvIsAtMyAccountPage();
    }

    @Dado("que estou na tela de My Account")
    public void que_estou_na_tela_de_My_Account() {
        que_estou_na_tela_de_login();
        faço_login_com_email_válido();
        vejo_a_tela_de_My_Account();
    }

    @Quando("clico em Sign out")
    public void clico_em_Sign_out() {
        loginPage.clickBtnSignOut();
    }

}