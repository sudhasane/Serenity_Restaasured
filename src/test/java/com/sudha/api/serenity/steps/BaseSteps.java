package com.sudha.api.serenity.steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

import java.nio.charset.StandardCharsets;

import com.sudha.api.serenity.config.EnvConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseSteps {
    private static final RequestSpecification spec;

    static {

        final RestAssuredConfig config = RestAssuredConfig.newConfig()
                .encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset(StandardCharsets.UTF_8));

        final RequestSpecBuilder specBuilder = new RequestSpecBuilder()
                .setConfig(config)
                .setBaseUri(EnvConfig.TEST_URL)
                .setRelaxedHTTPSValidation();

        spec = specBuilder.build();
    }

    public RequestSpecification rest() {
        return SerenityRest.given(spec);
    }
}
