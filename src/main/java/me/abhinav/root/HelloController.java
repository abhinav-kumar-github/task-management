package me.abhinav.root;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    public String helloWorld() {
        return "hello";
    }
    @GetMapping("/name")
    public String helloName(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
