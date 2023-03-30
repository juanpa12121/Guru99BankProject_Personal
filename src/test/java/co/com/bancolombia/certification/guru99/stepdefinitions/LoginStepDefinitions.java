package co.com.bancolombia.certification.guru99.stepdefinitions;
import co.com.bancolombia.certification.guru99.questions.ValidateHomeLeftOptions;
import co.com.bancolombia.certification.guru99.questions.ValidateWelcomeMessage;
import co.com.bancolombia.certification.guru99.tasks.LoginUser;
import co.com.bancolombia.certification.guru99.utils.Constants;
import co.com.bancolombia.certification.guru99.models.DataLogin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.bancolombia.certification.guru99.utils.Constants.URL_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constants.ACTOR_NAME);
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL_PAGE));
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials(List<DataLogin> dataLoginList) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.login(dataLoginList.get(0)));
    }

    @Then("^I should be logged successfully and I see the welcome message (.*)$")
    public void iShouldBeLoggedSuccessfullyAndISeeTheWelcomeMessage(String welcomeMessage) {
        theActorInTheSpotlight().should(seeThat(ValidateWelcomeMessage.isVisible(), Matchers.equalTo(welcomeMessage)));
    }

    @Then("^I validate that list of left menu options are displayed$")
    public void iValidateThatListOfLeftMenuOptionsAreDisplayed() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateHomeLeftOptions.isPresent()));
    }
}