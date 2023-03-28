package pageobjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class registerPageObjects  extends PageObject {

    By LNK_LOGIN = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
    By LNK_REGISTER = By.xpath("//a[@href='/actions/Account.action?newAccountForm=']");
    By TXT_USER = By.xpath("//input[@name='username']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By TXT_REPASSWORD = By.xpath("//input[@name='repeatedPassword']");
    By TXT_FIRST_NAME = By.xpath("//input[@name='account.firstName']");
    By TXT_LAST_NAME = By.xpath("//input[@name='account.lastName']");
    By TXT_EMAIL = By.xpath("//input[@name='account.email']");
    By TXT_PHONE = By.xpath("//input[@name='account.phone']");
    By TXT_ADDRESS1 = By.xpath("//input[@name='account.address1']");
    By TXT_CITY = By.xpath("//input[@name='account.city']");
    By TXT_COUNTRY = By.xpath("//input[@name='account.country']");
    By TXT_STATE = By.xpath("//input[@name='account.state']");
    By TXT_ZIP = By.xpath("//input[@name='account.zip']");
    By LST_CATEGORY = By.xpath("//select[@name='account.favouriteCategoryId']");
    By CKD_MYLIST = By.xpath("//input[@name='account.listOption']");
    By BTN_SAVE = By.xpath("//input[@name='newAccount']");

    public By getLST_CATEGORY() {
        return LST_CATEGORY;
    }

    public void setLST_CATEGORY(By LST_CATEGORY) {
        this.LST_CATEGORY = LST_CATEGORY;
    }

    public By getTXT_STATE() {
        return TXT_STATE;
    }

    public void setTXT_STATE(By TXT_STATE) {
        this.TXT_STATE = TXT_STATE;
    }

    public By getTXT_ZIP() {
        return TXT_ZIP;
    }

    public void setTXT_ZIP(By TXT_ZIP) {
        this.TXT_ZIP = TXT_ZIP;
    }

    public By getBTN_SAVE() {
        return BTN_SAVE;
    }

    public void setBTN_SAVE(By BTN_SAVE) {
        this.BTN_SAVE = BTN_SAVE;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getTXT_PHONE() {
        return TXT_PHONE;
    }

    public void setTXT_PHONE(By TXT_PHONE) {
        this.TXT_PHONE = TXT_PHONE;
    }

    public By getTXT_ADDRESS1() {
        return TXT_ADDRESS1;
    }

    public void setTXT_ADDRESS1(By TXT_ADDRESS1) {
        this.TXT_ADDRESS1 = TXT_ADDRESS1;
    }

    public By getTXT_CITY() {
        return TXT_CITY;
    }

    public void setTXT_CITY(By TXT_CITY) {
        this.TXT_CITY = TXT_CITY;
    }

    public By getTXT_COUNTRY() {
        return TXT_COUNTRY;
    }

    public void setTXT_COUNTRY(By TXT_COUNTRY) {
        this.TXT_COUNTRY = TXT_COUNTRY;
    }

    public By getCKD_MYLIST() {
        return CKD_MYLIST;
    }

    public void setCKD_MYLIST(By CKD_MYLIST) {
        this.CKD_MYLIST = CKD_MYLIST;
    }

    public By getLNK_LOGIN() {
        return LNK_LOGIN;
    }

    public void setLNK_LOGIN(By LNK_LOGIN) {
        this.LNK_LOGIN = LNK_LOGIN;
    }

    public By getLNK_REGISTER() {
        return LNK_REGISTER;
    }

    public void setLNK_REGISTER(By LNK_REGISTER) {
        this.LNK_REGISTER = LNK_REGISTER;
    }

    public By getTXT_USER() {
        return TXT_USER;
    }

    public void setTXT_USER(By TXT_USER) {
        this.TXT_USER = TXT_USER;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getTXT_REPASSWORD() {
        return TXT_REPASSWORD;
    }

    public void setTXT_REPASSWORD(By TXT_REPASSWORD) {
        this.TXT_REPASSWORD = TXT_REPASSWORD;
    }

    public By getTXT_FIRST_NAME() {
        return TXT_FIRST_NAME;
    }

    public void setTXT_FIRST_NAME(By TXT_FIRST_NAME) {
        this.TXT_FIRST_NAME = TXT_FIRST_NAME;
    }

    public By getTXT_LAST_NAME() {
        return TXT_LAST_NAME;
    }

    public void setTXT_LAST_NAME(By TXT_LAST_NAME) {
        this.TXT_LAST_NAME = TXT_LAST_NAME;
    }


}
