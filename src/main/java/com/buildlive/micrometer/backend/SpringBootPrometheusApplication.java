package com.buildlive.micrometer.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootPrometheusApplication {

	@GetMapping("/message")
	public String getStarterMessage(){
		return "Started working";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrometheusApplication.class, args);
	}

}
