package pages.home;


import org.openqa.selenium.By;
import utils.BasePage;

public class HomePage extends BasePage {

    public final By btnSignin = By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a");
    public final By btnContactUs = By.id("contact-link");
    public final By tvPopular = By.xpath("html/body/div[1]/div[2]/div/div[2]/div/ul/li[1]/a");


    public void clickBtnSignIn() {
        click(btnSignin);
    }

    public boolean tvIsAtHome(){
        return isVisible(tvPopular) && isVisible(btnContactUs);
    }

    public void clickBtnContactUs() {
        click(btnContactUs);
    }






}
