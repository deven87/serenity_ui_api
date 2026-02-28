package base;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import util.EnvPropReader;


@ExtendWith(SerenityJUnit5Extension.class)
public class BaseTestUI {

    @Managed
    WebDriver driver;

    protected String environment;

    @BeforeEach
    public void setEnvironment() {
        environment = "environments." + System.getProperty("environment");
        System.out.println("environment: " + environment);
    }
}
