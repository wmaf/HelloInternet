package com.careerdevs.hellointernet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class NasaController {
//    @GetMapping("/nasa")
//    public Object nasaPicOfDay(RestTemplate restTemplate) {
//        Object requestData = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz", Object.class);
//        return requestData;
//  }
//    @GetMapping("/pickFive")
//    public Object pickFive(RestTemplate restTemplate) {
//        Object requestFive = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz", Object.class);
//        return requestFive;
//  }
    @GetMapping ("/getPhotosInRange")
    public Object getPhotosInRange(RestTemplate restTemplate) {
        Object getDateRange = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?start_date=2015-09-07&end_date=2015-09-08&api_key=EyYqFD5EeIjFv1oDtWej5fAYlywEOqJwIqr1r2yz",Object.class);
        return getDateRange;
    }
}
