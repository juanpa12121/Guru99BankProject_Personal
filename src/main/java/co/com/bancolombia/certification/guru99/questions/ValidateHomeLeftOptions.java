package co.com.bancolombia.certification.guru99.questions;

import co.com.bancolombia.certification.guru99.userinterfaces.HomePage;
import co.com.bancolombia.certification.guru99.utils.ConvertWebElementToText;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidateHomeLeftOptions implements Question<Boolean> {

    List<String> textLeftOptions = new ArrayList<>();


    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> leftOptionsFromPage = HomePage.LST_LEFT_OPTIONS.resolveAllFor(actor);
        textLeftOptions = ConvertWebElementToText.getTextLeftOptions(leftOptionsFromPage, textLeftOptions);
        for(String string:textLeftOptions){
            System.out.println(string);
        }
        return true;
    }

    public static ValidateHomeLeftOptions isPresent() {
        return new ValidateHomeLeftOptions();
    }
}
