package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BonyGarciaSteps;

public class BonyGarciaStepDefinitions {


@Steps
    BonyGarciaSteps bonyGarciaSteps;
    @Given("^user open url$")
    public void user_open_url() {
bonyGarciaSteps.open();
    }
    @When("^user diligence data$")
    public void user_diligence_data() {
bonyGarciaSteps.clickWebForm();
bonyGarciaSteps.txtInput();
bonyGarciaSteps.txtPassword();
bonyGarciaSteps.txtTarea();
bonyGarciaSteps.txtCheckDefault();
    }
    @Then("^the fields with information$")
    public void the_fields_with_information() {
bonyGarciaSteps.exit();
    }

}
