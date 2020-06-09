package com.sudha.api.serenity.steps;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.List;

public class WalmartSearch extends BaseSteps {

    @Step("Walmart search api")
    public void walmartSearchApi() {
        Response response = rest().given().formParam("query", "ipod")
                .formParam("format", "json")
                .formParam("apikey", "srkz2vtdkqy3f6u4qhqcch8x")
                .get("/search").then().statusCode(200).extract().response();

    }

    @Step("Get name details")
    public void getNameDetails() {
        List<Float> names = rest().given().queryParam("query", "ipod")
                .queryParam("format", "json")
                .queryParam("apikey", "srkz2vtdkqy3f6u4qhqcch8x")
                .get("/search").then().extract().path("items.findAll{it.name=='Apple iPod touch 7th Generation 128GB - Gold (New Model)'}.salePrice");
    }

    @Step("Get sale price details")
    public void getSalePriceDetails() {
        List<Float> names = rest().given().queryParam("query", "ipod")
                .queryParam("format", "json")
                .queryParam("apikey", "srkz2vtdkqy3f6u4qhqcch8x")
                .get("/search").then().extract().path("items.findAll{it.salePrice < 100}.name");
    }

    @Step("Get name details")
    public void getnameeDetails() {
        List<Float> names = rest().given().queryParam("query", "ipod")
                .queryParam("format", "json")
                .queryParam("apikey", "srkz2vtdkqy3f6u4qhqcch8x")
                .get("/search").then().extract().path("items.findAll{it.name ==~/Ref.*/}");

        System.out.println(names.size());
    }
}
