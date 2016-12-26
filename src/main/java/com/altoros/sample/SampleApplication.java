package com.altoros.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApplication {

	@RequestMapping("/version")
	public String getVersion(){
		return "v2.3";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}
