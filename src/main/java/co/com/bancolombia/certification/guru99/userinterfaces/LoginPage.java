package co.com.bancolombia.certification.guru99.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_USERID = Target.the("UserId Input").located(By.name("uid"));
    public static final Target INPUT_PASSWORD = Target.the("Password Input").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Login button").located(By.name("btnLogin"));

}
