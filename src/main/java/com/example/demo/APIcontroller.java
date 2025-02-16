package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class APIcontroller {
    @GetMapping("/helloWorld")
    public String newLogin (){
        return "HelloWorld";
    }
}
