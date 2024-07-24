package com.udacity.jpnd.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExternalSalesService implements SalesService {

    private String resource;

    public ExternalSalesService(String resource) {
        this.resource = resource;
    }

    @Override
    public String fizzBuzz(int i) {
        //send a request to url/fizzbuzz/{i}
        HttpRequest request = HttpRequest.newBuilder(URI.create(resource + i)).GET().build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException("Error retrieving value for " + i, e);
        }
    }
}
