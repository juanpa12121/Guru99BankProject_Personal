package co.com.bancolombia.certification.guru99.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ConvertWebElementToText {

    public static List<String> getTextLeftOptions(List<WebElementFacade> listOptions, List<String> stringList ){
        for(WebElementFacade element: listOptions){
            stringList.add(element.getTextValue());
        }
        return stringList;
    }
}
