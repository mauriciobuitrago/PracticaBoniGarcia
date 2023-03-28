package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.registerPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;

public class registerStep {

    registerPageObjects objRegisterPage = new registerPageObjects();

    @Step
    public void open() {
        objRegisterPage.open();

    }
    @Step
    public void clickLogin() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getLNK_LOGIN()).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void clickRegister() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getLNK_REGISTER()).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textUser() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_USER()).sendKeys("PepitoPerez");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Step
        public void textPassword() {
            objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_PASSWORD()).sendKeys("123456");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            @Step
            public void textRePassword() {
                objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_REPASSWORD()).sendKeys("123456");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            @Step
            public void textFirstName() {
                objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_FIRST_NAME()).sendKeys("Pepito");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
    @Step
    public void textLastName() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_LAST_NAME()).sendKeys("Perez");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textEmail() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_EMAIL()).sendKeys("fsilva@qvision.us");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textPhone() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_PHONE()).sendKeys("43215432");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textAddress() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_ADDRESS1()).sendKeys("Calle 80");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Step
        public void textCity() {
            objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_CITY()).sendKeys("Bogotá");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    @Step
    public void textState() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_STATE()).sendKeys("10");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textZip() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_ZIP()).sendKeys("Bogotá");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
            @Step
            public void textCountry() {
                objRegisterPage.getDriver().findElement(objRegisterPage.getTXT_COUNTRY()).sendKeys("Colombia");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
}
    @Step
    public void checkMyList() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getCKD_MYLIST()).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void btnSave() {
        objRegisterPage.getDriver().findElement(objRegisterPage.getBTN_SAVE()).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void robotsito()
    {
        objRegisterPage.getDriver().findElement(objRegisterPage.getLST_CATEGORY()).click();

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
                    } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
