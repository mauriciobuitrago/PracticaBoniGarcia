package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.LoginPageObjects;
import pageobjects.registerPageObjects;

public class LoginStep {

    LoginPageObjects objLoginPage = new LoginPageObjects();
    @Step
    public void open() {
        objLoginPage.open();
    }
    @Step
    public void linkLogin() {
        objLoginPage.getDriver().findElement(objLoginPage.getLNK_LOGIN()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void txtUserSuccessfull() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_USER()).sendKeys("PepitoPerez");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void txtPasswordSucessfull() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).clear();
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).sendKeys("123456");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void txtUserUnsucessfull() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_USER()).sendKeys("Pepitos");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void txtPasswordUnsucessfull() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).clear();
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).sendKeys("1234567890");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void txtUserNoData() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_USER()).sendKeys("");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void txtPasswordNoData() {
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).clear();
        objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).sendKeys("");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Step
        public void btnLogin() {
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_LOGIN()).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    @Step
    public void lblInvalid() {
        objLoginPage.getDriver().findElement(objLoginPage.getLBL_UNSUCCESSFULL()).getText();
        System.out.println("Validacion erronea " + objLoginPage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
