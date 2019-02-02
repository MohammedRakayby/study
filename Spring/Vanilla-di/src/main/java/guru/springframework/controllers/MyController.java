package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

	private GreetingService greetingService;
	
    public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello(){
        System.out.println("Hello!!! ");
        
        return "foo";
    }
	public String greet() {
		return this.greetingService.sayGreeting();
	}
}
