package pages.login;

import org.openqa.selenium.By;
import utils.BasePage;

public class LoginPage extends BasePage {

    public final By tvLoginPage = By.xpath("/html/body/div[1]/div[2]/div/div[1]/span[2]");
    public final By etEmail = By.id("email");
    public final By etPassword = By.id("passwd");
    public final By btnSignIn = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span");
    public final By tvErrorAuthentication = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li");
    public final By tvMyAccount = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a/span");
    public final By btnSignOut = By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a");

    public boolean tvIsAtLoginPage(){
        return isVisible(tvLoginPage) && isVisible(etEmail);
    }

    public void fillEmail(String any) {
        fillInput(any, etEmail);
    }

    public void fillPassword(String any) {
        fillInput(any, etPassword);
    }

    public void clickBtnSignIn() {
        click(btnSignIn);
    }

    public void clickBtnSignOut() {
        click(btnSignOut);
    }

    public boolean tvIsAuthenticationError(){
        return isVisible(tvErrorAuthentication);
    }

    public boolean tvIsAtMyAccountPage(){
        return isVisible(tvMyAccount);

    }

}
