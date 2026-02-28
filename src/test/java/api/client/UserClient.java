package api.client;

import api.specs.RequestSpec;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserClient {

    private final RequestSpecification requestSpec;

    public UserClient(RequestSpecification requestSpec) {
        this.requestSpec = requestSpec;
    }

    public Response getUser(int userId) {
        return requestSpec.get("/api/users/" + userId);
    }
}
