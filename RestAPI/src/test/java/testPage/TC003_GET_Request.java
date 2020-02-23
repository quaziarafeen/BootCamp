package testPage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC003_GET_Request {
    @Test
    void googleMapTest(){

        RestAssured.baseURI = "http://maps.googleapis.com";

        //Request object
        RequestSpecification httprequest = RestAssured.given();

        //Response object
        Response response = httprequest.request(Method.GET, "/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response body is:" + responseBody);

        //capture details of headers from response
        String contentType= response.header("content-Type");
        System.out.println("content type is "+ contentType);
    }
}
