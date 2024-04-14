package rest.assured;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestDeleteAPI {

    @Test
    public void test_delete_api() {
        given().
        when().delete("https://reqres.in/api/users/2").
        then().statusCode(204);
    }

}
