package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
