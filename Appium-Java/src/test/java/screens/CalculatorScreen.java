package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.BaseScreen;

public class CalculatorScreen extends BaseScreen {

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "digit4")
    public MobileElement btnFour;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "digit2")
    public MobileElement btnTwo;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "plus")
    public MobileElement btnPlus;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "minus")
    public MobileElement btnMinus;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "equal")
    public MobileElement btnEqual;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "resultEditTextID")
    public MobileElement tvResult;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "radId")
    public MobileElement tvDeg;

    public String Addiction = "6";
    public String Subtraction = "2";

    public boolean isinHomeScreen(){
        return isVisible(tvDeg);
    }

    public void clickbtnFour(){
        click(btnFour);
    }
    public void clickbtnTwo(){
        click(btnTwo);
    }
    public void clickbtnPlus(){
        click(btnPlus);
    }
    public void clickbtnMinus(){
        click(btnMinus);
    }
    public void clickbtnEqual(){
        click(btnEqual);
    }
    public void checkAddiction(){
        compareText(tvResult, Addiction);
    }
    public void checkSubtraction(){
        compareText(tvResult, Subtraction);
    }
}
