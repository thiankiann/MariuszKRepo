package pl.sda.javalondek4springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myFirstRestController {

    @GetMapping("/say-something")
    public String saySometing() {

        return "hello Rest";
    }

}
