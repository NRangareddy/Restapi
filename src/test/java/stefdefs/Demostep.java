package stefdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;


import io.netty.handler.codec.http.HttpHeaders;

public class Demostep {
	 private  HttpHeaders headers;
	
private Object emp_name;
private String name_id;

@Given("I  set POST employee service api endpoint")
public void i_set_post_employee_service_api_endpoint() {
	
	 baseURI = "http://dummy.restapiexample.com/api/v1/create";
     System.out.println("Add URL :"+baseURI);
}

@When("I set request HEADER")
public void i_set_request_header() {
//	headers= new HttpHeaders();
	
	


}

@When("Send a POST HTTP request")
public void send_a_post_http_request() {
	double doublename_id = Math.random();
    emp_name = "zozo_"+name_id;//Just to avoid Duplicate Name entry
String jsonBody=
"{\"name\":\""+emp_name+"\",\"salary\":\"123\",\"age\":\"23\"}";
    System.out.println("\n\n" + jsonBody);
//    HttpEntity<String>entity = new HttpEntity<String>(jsonBody, headers);       
//    //POST Method to Add New Employee
//    restTemplate = newRestTemplate ();
//    response = restTemplate.postForEntity(addURI, entity, String.class);
}

@Then("I receive valid Response")
public void i_receive_valid_response() {
}



}
