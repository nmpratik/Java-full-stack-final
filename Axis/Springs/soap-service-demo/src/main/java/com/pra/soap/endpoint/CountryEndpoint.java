package com.pra.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pra.soap.gen.Country;
import com.pra.soap.gen.Currency;
import com.pra.soap.gen.GetCountryRequest;
import com.pra.soap.gen.GetCountryResponse;

@Endpoint
public class CountryEndpoint {
    
    private static final String NAMESPACE_URI = "http://soap.pra.com/gen";

    @PayloadRoot(
        namespace = NAMESPACE_URI,
        localPart = "getCountryRequest"
    )
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {

        Country country = new Country();
        country.setName(request.getName());
        country.setCapital("aaa");
        country.setCurrency(Currency.EUR);
        country.setPopulation(100);

        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(country);

        return response;
    }
}
