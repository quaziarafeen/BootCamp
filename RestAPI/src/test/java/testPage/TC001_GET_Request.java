package testPage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_GET_Request {
    @Test
    void getWeatherDetails(){

        //Specify base URI
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        //Request object
        RequestSpecification httprequest = RestAssured.given();

        //Response object
        Response response = httprequest.request(Method.GET, "/New York");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response body is:" + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);

        //Status line verification
        String sttausLine = response.getStatusLine();
        System.out.println("Status Line is :" + sttausLine);
        Assert.assertEquals(sttausLine, "HTTP/1.1 200 OK");
    }
}
