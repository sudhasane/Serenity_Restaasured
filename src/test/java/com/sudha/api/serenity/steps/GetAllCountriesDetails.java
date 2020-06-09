package com.sudha.api.serenity.steps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import java.util.List;

import java.util.HashMap;

import static org.hamcrest.Matchers.hasItems;

public class GetAllCountriesDetails extends BaseSteps{
     public static Response response;

    @Step("When country details are received successfully")
    public Response whenCounytryDetailsAreReceivedSuccessfully() {
        Response response = rest().given()
                .header("Content-Type", ContentType.JSON)
                .get("/all")
                .then().statusCode(200).extract().response();
        System.out.println(response);
        return response;
    }

    @Step("Then I should see country details")
    public void thenIShouldSeeCountryDetails(Response response){
        response.then()
                .body("name",hasItems("Afghanistan"))
                .body("capital", hasItems("Kabu"));
    }

    @Step("When I get single country details successfully")
    public Response whenIGetSingleCountryDetailsSuccessfully() {
         Response response = rest().given()
                .header("Content-Type", ContentType.JSON)
                .get("/name/Afghanistan")
                .then().statusCode(200).extract().response();
         return response;
    }

    @Step("Walmart search api")
    public void walmartSearchApi(){
        Response response = rest().given().queryParam("query","ipod")
                .queryParam("format","json")
                .queryParam("apikey","srkz2vtdkqy3f6u4qhqcch8x")
                .get("/search").then().statusCode(200).extract().response();
        System.out.println(response.prettyPrint());
    }


}
