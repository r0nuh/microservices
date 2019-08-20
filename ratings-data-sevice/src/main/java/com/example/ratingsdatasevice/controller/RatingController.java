package com.example.ratingsdatasevice.controller;

import com.example.ratingsdatasevice.models.Rating;
import com.example.ratingsdatasevice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRatingByMovie(@PathVariable int movieId){
        return new Rating(movieId, 5);
    }

    @GetMapping("users/{userId}")
    public UserRating getRatingByUser(@PathVariable String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating(1, 5),
                new Rating(1234, 3),
                new Rating(1235, 4)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);
        return userRating;
    }
}
