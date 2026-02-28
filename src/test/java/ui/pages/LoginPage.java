package ui.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("/practice-test-login")
public class LoginPage extends PageObject {

    private WebElementFacade usernameInput() {
        return $("#username");
    }

    private WebElementFacade passwordInput() {
        return $("#password");
    }

    private WebElementFacade loginButton() {
        return $("#submit");
    }

    private WebElementFacade welcomeMessageLabel() {
        return $(".post-title");
    }

    public void openLoginPage() {
        open();
    }

    public void login(String userName, String password) {
        usernameInput().type(userName);
        passwordInput().type(password);
        loginButton().click();
    }

    public void shouldLoggedInSuccessfully() {
        welcomeMessageLabel().shouldContainText("Logged In Successfully");
    }
}
