package ui.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import ui.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage; // no @Steps, Serenity will inject automatically

    @Step
    public void openLoginPage() {
        loginPage.openLoginPage();
    }

    @Step("Login as user {0} and password {1}")
    public void login(String user, String password) {
        loginPage.login(user, password);
    }

    @Step("Verify user is logged in")
    public void verifyLoggedIn() {
        loginPage.shouldLoggedInSuccessfully();
    }
}
