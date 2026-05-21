package maps;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class AddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting base URL
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		//Sending Post request given -> when -> then
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"TFGS stores\",\r\n"
				+ "  \"phone_number\": \"(+91) 9059624551\",\r\n"
				+ "  \"address\": \"Main road, Indira chowk\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe mart\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://TFGS.com\",\r\n"
				+ "  \"language\": \"Telugu-IN\"\r\n"
				+ "}\r\n"
				+ "").when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200);

	}

}