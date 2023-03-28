package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class PurchasePageObject extends PageObject {

    By LNK_LOGIN = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
    By TXT_USER = By.xpath("//input[@name='username']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By BTN_LOGIN = By.xpath("//input[@name='signon']");
    By LNK_FISH = By.xpath("//img[@src='../images/sm_fish.gif']");
    By LNK_KOI = By.xpath("//a[@href='/actions/Catalog.action?viewProduct=&productId=FI-FW-01']   ");
    By LNK_KOI4 = By.xpath("//a[@href='/actions/Catalog.action?viewItem=&itemId=EST-4']");
    By BTN_ADDCART = By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-4']");
    By TXT_QUANTITY = By.xpath("//input[@name='EST-4']");
    By BTN_PROCEED = By.xpath("//a[@href='/actions/Order.action?newOrderForm=']");
    By BTN_CONTINUE = By.xpath("//input[@name='newOrder']");
    By BTN_CONFIRM = By.xpath("//a[@href='/actions/Order.action?newOrder=&confirmed=true']");

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }

    public By getBTN_CONFIRM() {
        return BTN_CONFIRM;
    }

    public void setBTN_CONFIRM(By BTN_CONFIRM) {
        this.BTN_CONFIRM = BTN_CONFIRM;
    }

    public By getLNK_LOGIN() {
        return LNK_LOGIN;
    }

    public void setLNK_LOGIN(By LNK_LOGIN) {
        this.LNK_LOGIN = LNK_LOGIN;
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

    public By getLNK_FISH() {
        return LNK_FISH;
    }

    public void setLNK_FISH(By LNK_FISH) {
        this.LNK_FISH = LNK_FISH;
    }

    public By getLNK_KOI() {
        return LNK_KOI;
    }

    public void setLNK_KOI(By LNK_KOI) {
        this.LNK_KOI = LNK_KOI;
    }

    public By getLNK_KOI4() {
        return LNK_KOI4;
    }

    public void setLNK_KOI4(By LNK_KOI4) {
        this.LNK_KOI4 = LNK_KOI4;
    }

    public By getBTN_ADDCART() {
        return BTN_ADDCART;
    }

    public void setBTN_ADDCART(By BTN_ADDCART) {
        this.BTN_ADDCART = BTN_ADDCART;
    }

    public By getTXT_QUANTITY() {
        return TXT_QUANTITY;
    }

    public void setTXT_QUANTITY(By TXT_QUANTITY) {
        this.TXT_QUANTITY = TXT_QUANTITY;
    }

    public By getBTN_PROCEED() {
        return BTN_PROCEED;
    }

    public void setBTN_PROCEED(By BTN_PROCEED) {
        this.BTN_PROCEED = BTN_PROCEED;
    }

    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public void setBTN_CONTINUE(By BTN_CONTINUE) {
        this.BTN_CONTINUE = BTN_CONTINUE;
    }
}
