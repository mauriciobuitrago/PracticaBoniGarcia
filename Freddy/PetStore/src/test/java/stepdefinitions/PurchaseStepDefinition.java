package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.PurchaseStep;

public class PurchaseStepDefinition {

    @Steps
    PurchaseStep purchaseStep;

    @Given("^open Url pets$")
    public void openUrlpets() {

        purchaseStep.open();
    }
    @When("^user selects products and makes purchase$")
    public void userSelectsProductsAndMakesPurchase() {
        purchaseStep.linkLogin();
        purchaseStep.textUser();
        purchaseStep.textPassword();
        purchaseStep.btnLogin();
        purchaseStep.linkFish();
        purchaseStep.linkKoi();
        purchaseStep.linkKoi4();
        purchaseStep.btnAddCart();
        purchaseStep.textQuantity();
        purchaseStep.btnProceed();
        purchaseStep.btnPContinue();
        purchaseStep.btnPConfirm();
    }
    @Then("^successful purchase$")
    public void successfulPurchase() {

    }



}
