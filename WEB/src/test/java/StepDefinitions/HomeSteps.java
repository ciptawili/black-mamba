package StepDefinitions;

import PageObject.HomePage;
import PageObject.StoreLandingPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public HomeSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }

    @Given("Open Store Page")
    public void goToHomePage(){

        HomePage homePage = new HomePage(driver, wait);
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("Buy the product")
    public void buyTheProduct() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.clickButtonBuy();
        Assert.assertTrue(homePage.formDetailOrderIsDisplayed());
    }

    @When("Click button feature setting")
    public void clickButtonFeatureSetting() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.clickButtonSetting();
    }

    @When("Fill form buyer and go to checkout page")
    public void fillFormBuyerAndGoToCheckoutPage() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.fillName("Testing");
        homePage.fillEmail("testing@gmail.com");
        homePage.fillPhoneNumber("08199928371");
        homePage.fillAdrress("jalan burungrang");
        homePage.fillCity("Samarinda");
        homePage.clickButtonCheckout();
        homePage.goToPaymentModal();
        Assert.assertTrue(homePage.orderSummaryIsDisplayed());
        homePage.clickButtonContinue();
    }

    @Then("Modal feature setting has displayed")
    public void modalFeatureSettingHasDisplayed() {

        HomePage homePage = new HomePage(driver, wait);
        Assert.assertTrue(homePage.modalFeatureSettingIsDisplayed());
        homePage.clickButtonCancelModal();
    }

    @When("Choose bank transfer payment and choose bank")
    public void chooseBankTransferPayment() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.clickBankTransfer();
        homePage.chooseBcaVa();
        homePage.clickButtonContinue();
        homePage.clickButtonContinue();
    }

    @Then("Success buy product")
    public void successBuyProduct() {

        HomePage homePage = new HomePage(driver, wait);
        Assert.assertTrue(homePage.notifSuccessIsDisplayed());
    }

    @When("Delete all data order")
    public void deleteAllDataOrder() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.fillName("");
        homePage.fillEmail("");
        homePage.fillPhoneNumber("");
        homePage.fillAdrress("");
        homePage.fillCity("");
        homePage.clickButtonCheckout();
    }

    @Then("Error message showed")
    public void errorMessageShowed() {

        HomePage homePage = new HomePage(driver, wait);
        Assert.assertTrue(homePage.notifSuccessIsDisplayed());
    }

    @When("Cancel buying product")
    public void cancelBuyingProduct() {

        HomePage homePage = new HomePage(driver, wait);
        homePage.clickButtonCancel();
        homePage.clickButtonCancel();
    }

    @Then("Store Page is Displayed")
    public void storePageIsDisplayed(){

        HomePage homePage = new HomePage(driver, wait);
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

}
