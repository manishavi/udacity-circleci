package com.udacity.jpnd.services;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static junit.framework.Assert.assertEquals;

class ExternalSalesServiceTest {
    static WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089));
    private static String serverPath = "http://localhost:8089";
    private String fizzBuzzPath = "/fizzbuzz/";

    ExternalSalesService fizzBuzzService;

    @BeforeAll
    static void setup(){
        wireMockServer.start();
    }

    @AfterAll
    static void cleanup(){
        wireMockServer.stop();
    }

    @BeforeEach
    void init(){
        wireMockServer.resetAll();
        fizzBuzzService = new ExternalSalesService(serverPath+fizzBuzzPath);
    }

    @Test
    public void externalFizzBuzz_passedValue_returnsExternalResponse() {
        int i = 3;
        String expected = "Fizz";
        wireMockServer.stubFor(get(urlEqualTo(fizzBuzzPath + i))
                .willReturn(aResponse().withStatus(200).withBody(expected)));
        String response = fizzBuzzService.fizzBuzz(i);
        assertEquals(expected, response);
    }

}