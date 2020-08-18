package StepDefination;

import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.given;
import TY.Generic.Spec_Builder;
import TY_Utils.EndPoint;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class get_Operation {
	RequestSpecification a1;
	Response a3;

	@Given("^user enter th base url$")
	public void user_enter_th_base_url() throws Throwable {

		a1 = given().spec(Spec_Builder.request_Spec_Builder());
	}

	@When("^user enters the \"([^\"]*)\" end point with GET HTTP request$")
	public void user_enters_the_something_end_point_with_get_http_request(String end) throws Throwable {

		EndPoint a2 = EndPoint.valueOf(end);
		a3 = a1.when().get(a2.getEndPoint());
	}

	@Then("^user should get the statuscode as \"([^\"]*)\"$")
	public void user_should_get_the_statuscode_as_something(String statuscode) throws Throwable {

		int a = Integer.parseInt(statuscode);
		Response a4 = a3.then().extract().response();
		System.out.println(a4.asString());
		System.out.println(a4.getStatusLine());
		Assert.assertEquals(a, a4.getStatusCode());

	}

}
