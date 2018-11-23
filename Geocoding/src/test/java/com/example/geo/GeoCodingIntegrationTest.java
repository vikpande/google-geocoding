package com.example.geo;

import com.example.geo.GeoCoding;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GeocodingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GeoCodingIntegrationTest {

    private String staticURL = "http://localhost:";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    public HttpHeaders httpHeaders;

    @Before
    public void setUp() throws Exception {
        httpHeaders = new HttpHeaders();
    }

    @Test
    public void testFindByAddress() throws Exception {

        GeoCoding geoCoding = new GeoCoding();
        String URI = "/getGeoCoding/{address}";
        HttpEntity<GeoCoding> httpEntity = new HttpEntity<>(geoCoding,httpHeaders);
        Map<String,String> param = new HashMap<>();
        param.put("address","amsterdam");
        ResponseEntity<Object> response = testRestTemplate.exchange(getCompleteEndPoint(URI), HttpMethod.GET,httpEntity, Object.class,param);
        HttpStatus statusCode= response.getStatusCode();
        Assert.assertEquals(HttpStatus.OK.value(), statusCode.value());
    }

    public String getCompleteEndPoint(String URI){
        System.out.println("Complete URL--->" + (staticURL + port + URI));
        return staticURL + port + URI;
    }

}