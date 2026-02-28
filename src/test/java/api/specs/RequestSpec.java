package api.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class RequestSpec {

    public static RequestSpecification createRequest(String baseUrl) {
        RequestSpecBuilder spec = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType("application/json")
                .addHeader("x-api-key", "reqres_54401ba6055b471aac38d04c0015f8d2");
        return SerenityRest.given().spec(spec.build());
    }
}
