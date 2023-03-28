package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.registerStep;

public class registerStepDefinition {

    @Steps
    registerStep RegisterStep;
    @Given("^open Url and register user in login$")
    public void openUrlAndRegisterUserInLogin() {

        RegisterStep.open();
    }

    @When("^user into data register$")
    public void userIntoDataRegister() {
RegisterStep.clickLogin();
RegisterStep.clickRegister();
RegisterStep.textUser();
RegisterStep.textPassword();
RegisterStep.textRePassword();
RegisterStep.textFirstName();
RegisterStep.textLastName();
RegisterStep.textEmail();
RegisterStep.textPhone();
RegisterStep.textAddress();
RegisterStep.textCity();
RegisterStep.textState();
RegisterStep.textZip();
RegisterStep.textCountry();
RegisterStep.robotsito();
RegisterStep.btnSave();

    }
    @Then("^register successfull$")
    public void registerSuccessfull() {

    }
}
