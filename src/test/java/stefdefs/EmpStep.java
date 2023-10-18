package stefdefs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.internal.support.FileReader;
import io.restassured.response.ValidatableResponse;

public class EmpStep {

	@Given("user creates the new data using post api where name is <{string}>,age as <{string}> ,salary as <{string}>")
	public void user_creates_the_new_data_using_post_api_where_name_is_age_as_salary_as(String name, String age, String salary) {

		HashMap map=new HashMap();

			map.put("name",name);
			map.put("age", age);
			map.put("salary", salary);
			
	        baseURI="https://dummy.restapiexample.com/api/v1";

	   ValidatableResponse response = given().body(map).contentType(ContentType.JSON).
	     when().post("/create").
	     then().assertThat().statusCode(200);
	    
	}

//@Then("validate the response")
//public void validate_the_response() {
//    
//}

	@Given("create new resource using post api using json file")
	public void create_new_resource_using_post_api_using_json_file() {
		baseURI="https://dummy.restapiexample.com/api/v1";
		File f=new File("input/inputData.json");
	//FileReader fr=new FileReader(f);
		given().body(f).contentType(ContentType.JSON).
		when().post("/create").
		then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();	
		
	}
}
