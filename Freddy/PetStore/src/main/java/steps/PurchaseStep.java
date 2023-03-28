package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.PurchasePageObject;

public class PurchaseStep {

    PurchasePageObject objPurchasePage = new PurchasePageObject();

    @Step
    public void open() {
        objPurchasePage.open();
    }
    @Step
    public void linkLogin() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getLNK_LOGIN()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void textUser() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getTXT_USER()).sendKeys("PepitoPerez");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void textPassword() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getTXT_PASSWORD()).clear();
        objPurchasePage.getDriver().findElement(objPurchasePage.getTXT_PASSWORD()).sendKeys("123456");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void btnLogin() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getBTN_LOGIN()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void linkFish() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getLNK_FISH()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void linkKoi() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getLNK_KOI()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void linkKoi4() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getLNK_KOI4()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void btnAddCart() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getBTN_ADDCART()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void textQuantity() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getTXT_QUANTITY()).clear();
        objPurchasePage.getDriver().findElement(objPurchasePage.getTXT_QUANTITY()).sendKeys("3");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void btnProceed() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getBTN_PROCEED()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void btnPContinue() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getBTN_CONTINUE()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void btnPConfirm() {
        objPurchasePage.getDriver().findElement(objPurchasePage.getBTN_CONFIRM()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
