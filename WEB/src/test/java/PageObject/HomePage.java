package PageObject;

import Utilities.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    private Random random = new Random();

    @FindBy (xpath = "//a[@class='btn buy']")
    private WebElement buttonBuy;

    @FindBy (xpath = "//div[@class='cart-checkout']")
    private WebElement buttonCheckout;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][1]//input")
    private WebElement inputName;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][2]//input")
    private WebElement inputEmail;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][3]//input")
    private  WebElement inputPhone;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][4]//input")
    private WebElement inputCity;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][5]//textarea")
    private WebElement inputAddress;

    @FindBy (xpath = "//div[@class='cart-section'][2]//tr[@class='table-content'][6]//input")
    private WebElement inputPostalCode;

    @FindBy (xpath = "//div[@class='cancel-btn']")
    private WebElement buttonCancel;

    @FindBy (xpath = "//div[@class='cart-checkout-settings']")
    private WebElement buttonCheckoutSetting;

    @FindBy (xpath = "//img[@alt='Features Settings']")
    private WebElement imgFeatureSetting;

    @FindBy (xpath = "//div[@class='pull-right']/a")
    private WebElement buttonStart;

    @FindBy (xpath = "//div[@class='pull-left hide-sm']/a")
    private WebElement buttonCancelModal;

    @FindBy (id = "snap-midtrans")
    private WebElement iFramePayment;

    @FindBy (xpath = "//div[@class='amount']")
    private WebElement sectionAmount;

    @FindBy (xpath = "//a[@class='button-main-content']")
    private WebElement buttonContinue;

    @FindBy (xpath = "//div[@class='list-title text-actionable-bold' and text()='ATM/Bank Transfer']")
    private WebElement paymentTransfer;

    @FindBy (xpath = "//a[@href='#/bca-va']")
    private WebElement vaBca;

    @FindBy (xpath = "//div[@class='trans-status trans-pending']")
    private WebElement notifSuccess;

    @FindBy (xpath = "//div[@class='text-button-main']/span[text()='Please Complete Payment']")
    private WebElement buttonCompletePayment;

    @FindBy (xpath = "//a[@class='header-back']")
    private WebElement closeModal;


    public boolean homePageIsDisplayed() {

        WaitUntilElementVisible(buttonBuy);
        buttonBuy.isDisplayed();
        return true;
    }

    public void clickButtonBuy() {

        WaitUntilElementVisible(buttonBuy);
        buttonBuy.isDisplayed();
        buttonBuy.click();

    }

    public boolean formDetailOrderIsDisplayed() {

        WaitUntilElementVisible(inputName);
        inputName.isDisplayed();
        WaitUntilElementVisible(inputAddress);
        inputAddress.isDisplayed();
        WaitUntilElementVisible(inputEmail);
        inputEmail.isDisplayed();
        WaitUntilElementVisible(inputPhone);
        inputPhone.isDisplayed();
        WaitUntilElementVisible(inputCity);
        inputCity.isDisplayed();
        WaitUntilElementVisible(inputPostalCode);
        inputPostalCode.isDisplayed();
        WaitUntilElementVisible(buttonCheckout);
        buttonCheckout.isDisplayed();
        buttonCheckout.isEnabled();
        WaitUntilElementVisible(buttonCancel);
        buttonCancel.isDisplayed();
        buttonCancel.isEnabled();
        WaitUntilElementVisible(buttonCheckoutSetting);
        buttonCheckoutSetting.isDisplayed();
        buttonCheckoutSetting.isEnabled();
        return true;

    }

    public void clickButtonSetting() {

        WaitUntilElementVisible(buttonCheckoutSetting);
        buttonCheckoutSetting.isDisplayed();
        buttonCheckoutSetting.click();

    }


    public boolean modalFeatureSettingIsDisplayed() {

        WaitUntilElementVisible(imgFeatureSetting);
        imgFeatureSetting.isDisplayed();
        WaitUntilElementVisible(buttonStart);
        buttonStart.isDisplayed();
        WaitUntilElementVisible(buttonCancelModal);
        buttonCancelModal.isDisplayed();
        return true;
    }

    public void clickButtonCancelModal() {

        WaitUntilElementVisible(buttonCancelModal);
        buttonCancelModal.isDisplayed();
        buttonCancelModal.click();

    }

    public void fillName(String name){

        WaitUntilElementVisible(inputName);
        inputName.clear();
        inputName.sendKeys(name);
    }

    public void fillEmail(String email){

        WaitUntilElementVisible(inputEmail);
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void fillPhoneNumber(String phone){

        WaitUntilElementVisible(inputPhone);
        inputPhone.clear();
        inputPhone.sendKeys(phone);
    }

    public void fillCity(String city){

        WaitUntilElementVisible(inputCity);
        inputCity.clear();
        inputCity.sendKeys(city);
    }

    public void fillAdrress(String address){

        WaitUntilElementVisible(inputAddress);
        inputAddress.clear();
        inputAddress.sendKeys(address);
    }

    public void clickButtonCheckout() {

        WaitUntilElementVisible(buttonCheckout);
        buttonCheckout.isDisplayed();
        buttonCheckout.click();

    }

    public void clickButtonCancel() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WaitUntilElementVisible(closeModal);
        closeModal.isDisplayed();
        closeModal.click();

    }

    public void goToPaymentModal() {

        WaitUntilElementVisible(iFramePayment);
        driver.switchTo().frame(iFramePayment);
    }

    public boolean orderSummaryIsDisplayed() {

        WaitUntilElementVisible(sectionAmount);
        sectionAmount.isDisplayed();
        WaitUntilElementVisible(buttonContinue);
        buttonContinue.isDisplayed();
        return true;
    }

    public void clickButtonContinue() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WaitUntilElementVisible(buttonContinue);
        buttonContinue.isDisplayed();
        buttonContinue.click();

    }

    public void clickBankTransfer() {

        WaitUntilElementVisible(paymentTransfer);
        paymentTransfer.isDisplayed();
        paymentTransfer.click();

    }

    public void chooseBcaVa() {

        WaitUntilElementVisible(vaBca);
        vaBca.isDisplayed();
        vaBca.click();

    }

    public boolean notifSuccessIsDisplayed() {

        WaitUntilElementVisible(notifSuccess);
        notifSuccess.isDisplayed();
        return true;
    }

    public void clickButtonComplete() {

        WaitUntilElementVisible(buttonCompletePayment);
        buttonCompletePayment.isDisplayed();
        buttonCompletePayment.click();

    }


//    public boolean successSignUp() {
//
//        WaitUntilElementVisible(modalPhoneVerification);
//        modalPhoneVerification.isDisplayed();
//        return true;
//    }

//    public boolean homePageAfterLoginIsDisplayed() {
//
//        WaitUntilElementVisible(headerLogo);
//        headerLogo.isDisplayed();
//        WaitUntilElementVisible(buttonAkunAfterLogin);
//        buttonAkunAfterLogin.isDisplayed();
//        WaitUntilElementVisible(inputAddress);
//        inputAddress.isDisplayed();
//        return true;
//    }
//
//    public boolean loginFormIsDisplayed() {
//
//        WaitUntilElementVisible(inputEmail);
//        inputEmail.isDisplayed();
//        WaitUntilElementVisible(inputPassword);
//        inputPassword.isDisplayed();
//        WaitUntilElementVisible(buttonLogin);
//        buttonLogin.isDisplayed();
//        WaitUntilElementVisible(linkSignUp);
//        linkSignUp.isDisplayed();
//        return true;
//    }
//
//    public boolean signUpFormIsDisplayed(){
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WaitUntilElementVisible(inputFirstName);
//        inputFirstName.isDisplayed();
//        WaitUntilElementVisible(inputLastName);
//        inputLastName.isDisplayed();
//        WaitUntilElementVisible(inputPhoneNumber);
//        inputPhoneNumber.isDisplayed();
//        WaitUntilElementVisible(inputSignUpEmail);
//        inputSignUpEmail.isDisplayed();
//        WaitUntilElementVisible(inputSignUpPassword);
//        inputSignUpPassword.isDisplayed();
//        WaitUntilElementVisible(buttonSignUp);
//        buttonSignUp.isDisplayed();
//        return true;
//    }
//
//    public void clickAkunMenu() {
//
//        WaitUntilElementVisible(buttonAkun);
//        buttonAkun.isDisplayed();
//        buttonAkun.click();
//    }
//
//    public void fillEmail(String email){
//
//        WaitUntilElementVisible(inputEmail);
//        inputEmail.isEnabled();
//        inputEmail.clear();
//        inputEmail.sendKeys(email);
//    }
//
//    public void fillPassword(String password) {
//
//        WaitUntilElementVisible(inputPassword);
//        inputPassword.isEnabled();
//        inputPassword.clear();
//        inputPassword.sendKeys(password);
//    }
//
//    public void clickButtonLogin() {
//
//        WaitUntilElementVisible(buttonLogin);
//        buttonLogin.isEnabled();
//        buttonLogin.click();
//    }
//
//    public void clickSignUp() {
//
//        WaitUntilElementVisible(linkSignUp);
//        linkSignUp.isDisplayed();
//        linkSignUp.click();
//    }
//
//    public void fillFirstName(String firstName) {
//
//        WaitUntilElementVisible(inputFirstName);
//        inputFirstName.isEnabled();
//        inputFirstName.clear();
//        inputFirstName.sendKeys(firstName);
//    }
//
//    public void fillLastName(String lastName) {
//
//        WaitUntilElementVisible(inputLastName);
//        inputLastName.isEnabled();
//        inputLastName.clear();
//        inputLastName.sendKeys(lastName);
//    }
//
//    public void clickCountryCode(){
//
//        WaitUntilElementVisible(selectCountryCode);
//        selectCountryCode.isEnabled();
//        selectCountryCode.click();
//        inputCountryCode.sendKeys(Keys.ENTER);
//
//    }
//
//    public String selectCountryCode () {
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WaitUntilListElementVisible(valueCountryCode);
//        int randomValue = random.nextInt(valueCountryCode.size());
//        String countryCodeText = valueCountryCode.get(randomValue).getText();
//        WaitUntilElementVisible(valueCountryCode.get(randomValue));
//        WaitUntilElementIsClickable(valueCountryCode.get(randomValue));
//        valueCountryCode.get(randomValue).isDisplayed();
//        valueCountryCode.get(randomValue).isEnabled();
//        valueCountryCode.get(randomValue).click();
//        return countryCodeText;
//    }
//
//    public void fillPhoneNumber (String phone) {
//
//        WaitUntilElementVisible(inputPhoneNumber);
//        inputPhoneNumber.isEnabled();
//        inputPhoneNumber.clear();
//        inputPhoneNumber.sendKeys(phone);
//    }
//
//    public void fillSignUpEmail(String email) {
//
//        WaitUntilElementVisible(inputSignUpEmail);
//        inputSignUpEmail.isEnabled();
//        inputSignUpEmail.clear();
//        inputSignUpEmail.sendKeys(email);
//    }
//
//    public void fillSignUpPassword(String password) {
//
//        WaitUntilElementVisible(inputSignUpPassword);
//        inputSignUpPassword.isEnabled();
//        inputSignUpPassword.clear();
//        inputSignUpPassword.sendKeys(password);
//    }
//
//    public void clickButtonSignUp() {
//
//        WaitUntilElementVisible(buttonSignUp);
//        buttonSignUp.isEnabled();
//        buttonSignUp.click();
//    }
//
//    public String selectFavouriteStore () {
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WaitUntilListElementVisible(listFavouriteStore);
//        int randomValue = random.nextInt(listFavouriteStore.size());
//        String listStore = listFavouriteStore.get(randomValue).getText();
//        WaitUntilElementVisible(listFavouriteStore.get(randomValue));
//        WaitUntilElementIsClickable(listFavouriteStore.get(randomValue));
//        listFavouriteStore.get(randomValue).isDisplayed();
//        listFavouriteStore.get(randomValue).isEnabled();
//        listFavouriteStore.get(randomValue).click();
//        return listStore;
//    }
//
//    public void clickSpecialStore(){
//
//        WaitUntilElementVisible(selectSpecialStore);
//        selectSpecialStore.isDisplayed();
//        selectSpecialStore.isEnabled();
//        selectSpecialStore.click();
//    }
//
//    public void searchAddress(String address){
//
//        WaitUntilElementVisible(inputAddress);
//        inputAddress.isEnabled();
//        inputAddress.click();
//        inputAddress.sendKeys(address);
//    }
//
//    public String selectAddress () {
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WaitUntilListElementVisible(listAddress);
//        int randomValue = random.nextInt(listAddress.size());
//        String list = listAddress.get(randomValue).getText();
//        WaitUntilElementVisible(listAddress.get(randomValue));
//        WaitUntilElementIsClickable(listAddress.get(randomValue));
//        listAddress.get(randomValue).isDisplayed();
//        listAddress.get(randomValue).isEnabled();
//        listAddress.get(randomValue).click();
//        return list;
//    }
}
