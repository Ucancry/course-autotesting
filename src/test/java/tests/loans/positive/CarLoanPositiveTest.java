package tests.loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_LOAN_URL;

public class CarLoanPositiveTest extends BaseTest {
    @Test
    public void selectAgreementsTabInPublicSession() {
        basepage.goToUrl(CAR_LOAN_URL);
        carLoansPage.selectAgreementsTab();
        basepage.isAuthWidgetPresent();
    }
}
