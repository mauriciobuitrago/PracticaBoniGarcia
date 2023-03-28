package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;


public class loginStepDefinition {

    @Steps
    LoginStep loginStep;
    @Given("^open Url and user  login$")
    public void openUrlAndUserLogin() {
        loginStep.open();
    }

    @When("^user into data successfull$")
    public void userIntoDataSuccessfull() {
        loginStep.linkLogin();
        loginStep.txtUserSuccessfull();
        loginStep.txtPasswordSucessfull();
        loginStep.btnLogin();
    }

    @When("^user into data Unsuccesssfull$")
    public void userIntoDataUnsuccesssfull() {
        loginStep.linkLogin();
loginStep.txtUserUnsucessfull();
loginStep.txtPasswordUnsucessfull();
loginStep.btnLogin();

    }

    @Then("^login Unsuccesssfull$")
    public void loginUnsuccesssfull() {
loginStep.lblInvalid();
    }

    @Then("^login successfull$")
    public void loginSuccesssfull() {

    }
    @When("^does not enter user$")
    public void doesNotEnterUser() {
        loginStep.linkLogin();
        loginStep.txtUserUnsucessfull();
        loginStep.txtPasswordSucessfull();
        loginStep.btnLogin();
    }

    @When("^does not enter password$")
    public void doesNotEnterPassword() {
        loginStep.linkLogin();
        loginStep.txtUserSuccessfull();
        loginStep.txtPasswordUnsucessfull();
        loginStep.btnLogin();
    }
}
