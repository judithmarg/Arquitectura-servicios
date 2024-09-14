package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping()
    public String greeting() {
        return this.greetingService.getGreeting();
    }

    @GetMapping("/greet-with-name")
    public String greetWithName(
            @RequestBody Map<String, String> payload
    ) {
        String name = payload.get("name");
        return greetingService.getGreeting(name);
    }

}
