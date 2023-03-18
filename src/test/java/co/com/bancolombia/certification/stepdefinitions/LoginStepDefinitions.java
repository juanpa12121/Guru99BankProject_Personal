package co.com.bancolombia.certification.stepdefinitions;

import co.com.bancolombia.certification.models.DataLogin;
import co.com.bancolombia.certification.tasks.LoginUser;
import co.com.bancolombia.certification.utils.MyDriversWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.bancolombia.certification.utils.Constants.ACTOR_NAME;
import static co.com.bancolombia.certification.utils.Constants.URL;

public class LoginStepDefinitions {

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_NAME);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(URL)));
    }


    @When("^I enter valid credentials$")
    public void iEnterValidCredentials(List<DataLogin> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.login(data));
    }

    @Then("^I should be logged successfully and I see the welcome message$")
    public void iShouldBeLoggedSuccessfullyAndISeeTheWelcomeMessage() {

    }
}
