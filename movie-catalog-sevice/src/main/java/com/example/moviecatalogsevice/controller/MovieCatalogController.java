package com.example.moviecatalogsevice.controller;

import com.example.moviecatalogsevice.models.CatalogItem;
import com.example.moviecatalogsevice.models.Movie;
import com.example.moviecatalogsevice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping(value = "/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating(1, 5),
                new Rating(1234, 3),
                new Rating(1235, 4)
        );
        return ratings.stream().map(rating -> {
            Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8081/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
            return new CatalogItem(movie.getTitle(), "test", rating.getRating());
        })
                .collect(Collectors.toList());
    }
}
