package co.com.bancolombia.certification.guru99.tasks;

import co.com.bancolombia.certification.guru99.questions.ValidateHomeLeftOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.List;

import static co.com.bancolombia.certification.guru99.userinterfaces.HomePage.LST_LEFT_OPTIONS;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SeeHomeLeftOptions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> leftListOptions = LST_LEFT_OPTIONS.resolveAllFor(actor);
        actor.should(
                GivenWhenThen.seeThat(ValidateHomeLeftOptions.validate(leftListOptions), containsInAnyOrder("Manager", "New Customer", "Edit Customer", "Delete Customer", "New Account", "Edit Account", "Delete Account", "Mini Statement", "Customised Statement", "Log out")
        ));
    }

    public static SeeHomeLeftOptions seeLeftOptions(){
        return instrumented(SeeHomeLeftOptions.class);
    }
}
