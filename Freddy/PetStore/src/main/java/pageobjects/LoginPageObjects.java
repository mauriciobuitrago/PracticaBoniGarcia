package pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class LoginPageObjects extends PageObject {

    By LNK_LOGIN = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
    By TXT_USER = By.xpath("//input[@name='username']");
    By TXT_PASSWORD = By.xpath("//input[@name='password']");
    By BTN_LOGIN = By.xpath("//input[@name='signon']");
    By LBL_UNSUCCESSFULL = By.xpath("//*[@id=\"Content\"]/ul/li");

    public By getLNK_LOGIN() {
        return LNK_LOGIN;
    }

    public void setLNK_LOGIN(By LNK_LOGIN) {
        this.LNK_LOGIN = LNK_LOGIN;
    }

    public By getLBL_UNSUCCESSFULL() {
        return LBL_UNSUCCESSFULL;
    }

    public void setLBL_UNSUCCESSFULL(By LBL_UNSUCCESSFULL) {
        this.LBL_UNSUCCESSFULL = LBL_UNSUCCESSFULL;
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

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }
}
