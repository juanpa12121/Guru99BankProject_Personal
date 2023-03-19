package co.com.bancolombia.certification.guru99.stepdefinitions;

import co.com.bancolombia.certification.guru99.questions.ValidateWelcomeMessage;
import co.com.bancolombia.certification.guru99.tasks.LoginUser;
import co.com.bancolombia.certification.guru99.utils.Constants;
import co.com.bancolombia.certification.guru99.utils.MyDriversWeb;
import co.com.bancolombia.certification.guru99.models.DataLogin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constants.ACTOR_NAME);
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(Constants.URL)));
    }


    @When("^I enter valid credentials$")
    public void iEnterValidCredentials(List<DataLogin> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.login(data));
    }

    @Then("^I should be logged successfully and I see the welcome message (.*)$")
    public void iShouldBeLoggedSuccessfullyAndISeeTheWelcomeMessage(String welcomeMessage) {
        theActorInTheSpotlight().should(seeThat(ValidateWelcomeMessage.isVisible(), Matchers.equalTo(welcomeMessage)));

    }
}
