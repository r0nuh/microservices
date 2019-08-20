package com.example.ratingsdatasevice.controller;

import com.example.ratingsdatasevice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable int movieId){
        return new Rating(movieId, 5);
    }
}
