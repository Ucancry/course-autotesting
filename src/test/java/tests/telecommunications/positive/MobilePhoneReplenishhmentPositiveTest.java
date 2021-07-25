package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;
import pages.telecommunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishhmentPositiveTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() {
        basepage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basepage.isAuthWidgetPresent();
    }
    @Test
    public void checkMinimumReplenishmentAmount() {
        basepage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.
                enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardForm(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCart()
                .checkPaymentDetailsIsPresented("Mobile payment. Phone number +380686979712");


    }
}
