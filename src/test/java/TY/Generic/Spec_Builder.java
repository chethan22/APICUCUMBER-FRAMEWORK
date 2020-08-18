package TY.Generic;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder {

	public static RequestSpecification request_Spec_Builder() throws IOException {

		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification request = req_bui.setBaseUri(FetchProperties.getPropertiesValues())
				.setContentType(ContentType.JSON).build();

		return request;

	}

	public static ResponseSpecification response_Spec_Builder(int statuscode, String StatusLine) {

		ResponseSpecBuilder res_build = new ResponseSpecBuilder();
		ResponseSpecification response = res_build.expectContentType(ContentType.JSON).expectStatusCode(statuscode)
				.expectStatusLine(StatusLine).build();
		return response;

	}

}
