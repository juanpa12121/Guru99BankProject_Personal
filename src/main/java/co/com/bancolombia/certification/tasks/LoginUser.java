package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.models.DataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.userinterfaces.LoginPage.INPUT_USERID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

public class LoginUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("a").into(INPUT_USERID)

        );
    }

    public static LoginUser login(List<DataLogin> data){
        return instrumented(LoginUser.class, data);
    }
}
