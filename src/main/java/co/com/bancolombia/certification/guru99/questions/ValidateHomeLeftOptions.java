package co.com.bancolombia.certification.guru99.questions;

import co.com.bancolombia.certification.guru99.userinterfaces.HomePage;
import co.com.bancolombia.certification.guru99.utils.CSVUtilities;
import co.com.bancolombia.certification.guru99.utils.OperationOnList;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

public class ValidateHomeLeftOptions implements Question<Boolean> {

    List<String> textLeftOptionsFromPage = new ArrayList<>();
    List<String> textLeftoptionsFromCsv = new ArrayList<>();


    @Override
    public Boolean answeredBy(Actor actor) {

        List<WebElementFacade> leftOptionsFromPage = HomePage.LST_LEFT_OPTIONS.resolveAllFor(actor);

        //En esta lista se guardan los strings de cada WebElement, retornados por el método
        textLeftOptionsFromPage = OperationOnList.getTextLeftOptions(leftOptionsFromPage, textLeftOptionsFromPage);

        //En esta lista se guardan los strings del csv, retornados por la utilidad CSVUtilities
        textLeftoptionsFromCsv = CSVUtilities.getListOptions();

        System.out.println("From page");
        for (String string : textLeftOptionsFromPage) {
            System.out.println(string);
        }

        System.out.println("\nFrom CSV");
        for (String string : textLeftoptionsFromCsv) {
            System.out.println(string);
        }

        return textLeftoptionsFromCsv.equals(textLeftOptionsFromPage);
    }

    public static ValidateHomeLeftOptions isPresent() {
        return new ValidateHomeLeftOptions();
    }
}
