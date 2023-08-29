package com.example.remoteapibasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Moviecontroller {

    @Autowired
    RestTemplate restTemplate;



    @GetMapping("/get-Movie")
    public Object getMovieInfo(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=5943ef4a740cdb09efb6f157c8a83622";
        Object response = restTemplate.getForObject(url , Object.class);
        return response;
    }

    @GetMapping("/get-info")
    public MovieResponse getMovie(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=5943ef4a740cdb09efb6f157c8a83622";
        MovieResponse response = restTemplate.getForObject(url , MovieResponse.class);
        return response;
    }

    @GetMapping("/get-student")
    public Object getStudent(@RequestParam("q") int regNo){
        String url = "http://localhost:8080/student/get?q="+regNo;
        Object response = restTemplate.getForObject(url , Object.class);
        return response;
    }
}
