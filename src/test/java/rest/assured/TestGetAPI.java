package rest.assured;

import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestGetAPI {

    @Test
    public void test_getApi() {
        String resource = "https://reqres.in/api/users/2";
        ValidatableResponse response = given().
        when().get(resource).
        then().statusCode(200);
        response.log().body();
    }
}
