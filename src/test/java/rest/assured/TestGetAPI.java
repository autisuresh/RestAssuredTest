package rest.assured;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class TestGetAPI {

    @Test
    public void test_get_api() {
        String resource = "https://reqres.in/api/users/2";
        ValidatableResponse response = given().
        when().get(resource).
        then().statusCode(200).
        and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/java/rest/assured/schema.json")));

        int statusCode = response.extract().statusCode();
        Assert.assertEquals(statusCode, SC_OK);
    }

}
