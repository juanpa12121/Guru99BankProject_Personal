package co.com.bancolombia.certification.guru99.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/login_user.feature",
        glue = "co.com.bancolombia.certification.guru99.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@TestCase2"
)
public class LoginUser {
}
