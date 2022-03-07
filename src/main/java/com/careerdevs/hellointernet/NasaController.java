package com.careerdevs.hellointernet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class NasaController {

    @GetMapping("/nasa")
    public Object nasaPicOfDay(RestTemplate restTemplate) {
        Object requestData = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz", Object.class);
        return requestData;
    }
}