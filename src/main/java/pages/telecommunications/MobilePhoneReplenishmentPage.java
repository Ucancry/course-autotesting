package pages.telecommunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[text() = 'My wallet']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node= 'numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node= 'expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node= 'cvvdebitSource']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node= 'phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node= 'amount']");
    private final By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node= 'submit']");
    private final By paymentDetails = By.xpath("//span[@data-qa-node= 'details']");


    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardForm(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardExpDate(String expData){
        driver.findElement(inputCardFrom).sendKeys(expData);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    public MobilePhoneReplenishmentPage submitToTheCart(){
        driver.findElement(buttonSubmitToTheCart).click();
        return this;
    }

    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresented(String text){
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(text, details.getText());
        return this;
    }



}
