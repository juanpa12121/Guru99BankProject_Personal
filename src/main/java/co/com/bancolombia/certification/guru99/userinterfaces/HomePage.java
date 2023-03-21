package co.com.bancolombia.certification.guru99.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LBL_WELCOME_MESSAGE = Target.the("Welcome message").located(By.className("heading3"));

    public static final Target LST_LEFT_OPTIONS = Target.the("Left Home Page Options").located(By.xpath("//ul[@class='menusubnav']//li"));

}
