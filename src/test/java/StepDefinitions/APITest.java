package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Assert;

import java.io.File;

public class APITest {

    private Response response;

    @Given("I send GET request to {string}")
    public void i_send_get_request_to(String url) {
        response = RestAssured
                .given()
                .when()
                .get(url);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer statusCode) {
        Assert.assertEquals((int) statusCode, response.getStatusCode());
    }

    @Then("the number of companies returned should be {int}")
    public void the_number_of_companies_returned_should_be(Integer qty) {
        int dataSize = response.jsonPath().getList("data").size();
        Assert.assertEquals((int) qty, dataSize);
    }

    @Then("all ids in the response should not be null")
    public void all_ids_in_the_response_should_not_be_null() {
        var ids = response.jsonPath().getList("data.id");
        for (Object id : ids) {
            Assert.assertNotNull("Found null ID in response", id);
        }
    }

    @Then("the response should match JSON schema {string}")
    public void the_response_should_match_json_schema(String schemaPath) {
        File schema = new File("src/test/resources/" + schemaPath);
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(schema));
    }
}
