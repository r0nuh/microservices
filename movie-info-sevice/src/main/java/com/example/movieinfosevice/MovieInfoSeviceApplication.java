package com.example.movieinfosevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSeviceApplication.class, args);
	}

}
