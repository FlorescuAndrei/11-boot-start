package com.andrei.bootdemo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrei.bootdemo.entity.Hello;

@RestController
public class FunRestController {
	
	//inject properties from application.properties
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${tem.name}")
	private String teamName;
	
	//expose "/" that return hello world directly on browser with no jsp file
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now(); 
	}
	//JSON endpoint
	@GetMapping("/hello")
	public Hello sayHelloAgain() {
		return new Hello("Hello World of JSON! Time on server is " + LocalDateTime.now());
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5K!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day!";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		
		return "Coach" + coachName + ", Team name: " + teamName;
		
	}
	

}
