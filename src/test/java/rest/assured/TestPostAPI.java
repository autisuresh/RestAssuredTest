package rest.assured;

import org.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class TestPostAPI {

    @Test
    public void test_post_api() {
        JSONObject postjson = new JSONObject();
        postjson.put("name","Suresh Auti");
        postjson.put("job","QA");

        given().
                contentType("application/json").
                body(postjson.toString()).
        when().post("https://reqres.in/api/users").
        then().statusCode(201);
    }
}
