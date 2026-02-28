package api.steps;

import api.client.UserClient;
import api.specs.RequestSpec;
import api.specs.ResponseSpec;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import net.serenitybdd.annotations.Step;

public class UserApiSteps {

    UserClient userClient;
    Response response;

    @Step("Request user details for user ID: {userId}")
    public void getUserDetails(int userId) {
        userClient = new UserClient(RequestSpec.createRequest("https://reqres.in/"));
        response = userClient.getUser(userId);
        // Store the response for later verification
    }

    @Step("Verify user exists")
    public void validate200Response() {
        response.then().spec(ResponseSpec.sucess200());
    }


}
