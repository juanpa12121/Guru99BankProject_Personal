package co.com.bancolombia.certification.guru99.questions;

import co.com.bancolombia.certification.guru99.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateWelcomeMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return HomePage.LBL_WELCOME_MESSAGE.resolveAllFor(actor).get(0).getText();
    }

    public static ValidateWelcomeMessage isVisible(){
        return new ValidateWelcomeMessage();
    }
}
