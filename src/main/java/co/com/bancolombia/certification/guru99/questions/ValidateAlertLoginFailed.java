package co.com.bancolombia.certification.guru99.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.actions.Switch.*;


public class ValidateAlertLoginFailed implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        Alert alert;
        alert = (Alert) Switch.toAlert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    public static ValidateAlertLoginFailed isVisible(){
        return new ValidateAlertLoginFailed();
    }
}
