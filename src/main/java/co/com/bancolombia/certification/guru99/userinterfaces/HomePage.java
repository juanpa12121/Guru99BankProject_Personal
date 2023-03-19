package co.com.bancolombia.certification.guru99.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LBL_WELCOME_MESSAGE = Target.the("Welcome message").located(By.className("heading3"));

}
