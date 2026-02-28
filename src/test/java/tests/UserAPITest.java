package tests;

import api.steps.UserApiSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class UserAPITest {

    @Steps
    UserApiSteps userApiSteps;

    @WithTags({
            @WithTag("API"),
            @WithTag("smoke")
    })
    @Test
    public void getUserDetailsTest() {
        userApiSteps.getUserDetails(2);
        userApiSteps.validate200Response();
    }
}
