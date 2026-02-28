package api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpec {

    public static ResponseSpecification sucess200() {
        return new ResponseSpecBuilder()
                .expectContentType("application/json")
                .expectStatusCode(200).build();
    }

    public static ResponseSpecification failure404() {
        return new ResponseSpecBuilder()
                .expectStatusCode(404).build();
    }

    public static ResponseSpecification failure500() {
        return new ResponseSpecBuilder()
                .expectStatusCode(500).build();
    }
}
