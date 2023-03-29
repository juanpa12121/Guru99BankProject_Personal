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

    }

    public static SeeHomeLeftOptions seeLeftOptions(){
        return instrumented(SeeHomeLeftOptions.class);
    }
}
