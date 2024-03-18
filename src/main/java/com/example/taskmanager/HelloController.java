package com.example.taskmanager;
import org.springframework.web.bind.annotation.GetMapping; // Import the necessary package
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
          return "Hello guy!";
    } 
}
