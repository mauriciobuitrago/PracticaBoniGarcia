package steps;

import com.codoid.products.fillo.Select;
import net.thucydides.core.annotations.Step;
import pageobjects.BonyGarciaPage;
import org.hamcrest.Matchers;


public class BonyGarciaSteps {
    BonyGarciaPage objBonyGarciaPage = new BonyGarciaPage();

    @Step
    public void open() {
        objBonyGarciaPage.open();

    }

    @Step
    public void clickWebForm() {
        objBonyGarciaPage.getDriver().findElement(objBonyGarciaPage.getBTN_WEBFORM()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void txtInput() {
        objBonyGarciaPage.getDriver().findElement(objBonyGarciaPage.getTXT_INPUT()).sendKeys("Hola mi gente linda");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void txtPassword() {
        objBonyGarciaPage.getDriver().findElement(objBonyGarciaPage.getTXT_PASSWORD()).sendKeys("Welcome1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void txtTarea() {
        objBonyGarciaPage.getDriver().findElement(objBonyGarciaPage.getTXT_TAREA()).sendKeys("Pruebas numero1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void txtCheckDefault() {
        objBonyGarciaPage.getDriver().findElement(objBonyGarciaPage.getCHK_DEFAULT()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

      @Step
    public void exit() {
        objBonyGarciaPage.getDriver().close();

    }
}