package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://bonigarcia.dev/selenium-webdriver-java/")
public class BonyGarciaPage extends PageObject {

    By BTN_WEBFORM = By.xpath("//a[@href='web-form.html']");
    By TXT_INPUT = By.xpath("//input[@id='my-text-id']");
    By TXT_PASSWORD = By.xpath("//input[@name='my-password']");
    By TXT_TAREA = By.xpath("//textarea[@name='my-textarea']");
    By CHK_DEFAULT = By.xpath("//input[@id='my-check-2']");
    By LST_SELECT = By.xpath("//select[@name='my-select']");

    public By getLST_SELECT() {
        return LST_SELECT;
    }

    public void setLST_SELECT(By LST_SELECT) {
        this.LST_SELECT = LST_SELECT;
    }

    public By getBTN_WEBFORM() {
        return BTN_WEBFORM;
    }

    public void setBTN_WEBFORM(By BTN_WEBFORM) {
        this.BTN_WEBFORM = BTN_WEBFORM;
    }

    public By getTXT_INPUT() {
        return TXT_INPUT;
    }

    public void setTXT_INPUT(By TXT_INPUT) {
        this.TXT_INPUT = TXT_INPUT;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getTXT_TAREA() {
        return TXT_TAREA;
    }

    public void setTXT_TAREA(By TXT_TAREA) {
        this.TXT_TAREA = TXT_TAREA;
    }

    public By getCHK_DEFAULT() {
        return CHK_DEFAULT;
    }

    public void setCHK_DEFAULT(By CHK_DEFAULT) {
        this.CHK_DEFAULT = CHK_DEFAULT;
    }
}
