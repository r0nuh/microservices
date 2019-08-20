package com.example.movieinfosevice.controller;

import com.example.movieinfosevice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @GetMapping("/movieId")
    public Movie getMovieInfo(@PathVariable int movieId){
        return new Movie(1, "The Matrix");
    }

}
