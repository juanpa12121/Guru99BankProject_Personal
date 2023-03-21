package co.com.bancolombia.certification.guru99.tasks;

import co.com.bancolombia.certification.guru99.models.DataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.xml.crypto.Data;

import static co.com.bancolombia.certification.guru99.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

public class LoginUser implements Task {

    private DataLogin data;

    public LoginUser(DataLogin data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.getId()).into(INPUT_USERID),
                Enter.theValue(data.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginUser login(DataLogin data){
        return instrumented(LoginUser.class, data);
    }
}
