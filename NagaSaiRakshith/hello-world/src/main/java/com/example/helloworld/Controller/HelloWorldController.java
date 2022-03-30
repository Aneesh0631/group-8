package com.example.helloworld.Controller;

import com.example.helloworld.Model.HelloWorld;
import com.example.helloworld.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class HelloWorldController {

    private final HelloWorldService service;

    @Autowired
    public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

    @GetMapping(path = "getValue")
    public List<HelloWorld> getName() {
        return service.getValue();
    }

    @PostMapping(path = "setValue")
    public String setValue(@RequestBody String text){
         return service.setValue(text);
//        System.out.println("Function Called");
    }
}
