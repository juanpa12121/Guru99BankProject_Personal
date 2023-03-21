package co.com.bancolombia.certification.guru99.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.stream.Collectors;

public class ValidateHomeLeftOptions implements Question<List<String>> {

    private final List<WebElementFacade> elements;

    public ValidateHomeLeftOptions(List<WebElementFacade> elements) {
        this.elements = elements;
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return elements.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    public static ValidateHomeLeftOptions validate(List<WebElementFacade> elements) {
        return new ValidateHomeLeftOptions(elements);
    }
}
