package com.sudha.api.serenity.runner;

import com.sudha.api.serenity.steps.GetAllCountriesDetails;
import com.sudha.api.serenity.steps.WalmartSearch;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.restassured.response.Response;

@RunWith(SerenityRunner.class)
public class GetWallmartSearDetailsApiTest {

    @Steps
    WalmartSearch steps;

   @Test
   @Title("Get all contry details")
   public void   verifyWallmartSearchDetails(){
       steps.walmartSearchApi();
       steps.getNameDetails();
       steps.getSalePriceDetails();
       steps.getnameeDetails();
   }
}
