package tests;

import base.BaseTestUI;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ui.steps.LoginSteps;

import static net.serenitybdd.core.environment.WebDriverConfiguredEnvironment.getEnvironmentVariables;

@ExtendWith(SerenityJUnit5Extension.class)
public class UserUITest extends BaseTestUI {

    @Steps
    LoginSteps loginSteps;

    @WithTag("UI")
    @Test
    public void loginUiTest() {
        loginSteps.openLoginPage();
        loginSteps.login(getEnvironmentVariables().getProperty(environment + ".app.username"), getEnvironmentVariables().getProperty(environment + ".app.password"));
        loginSteps.verifyLoggedIn();
    }
}
