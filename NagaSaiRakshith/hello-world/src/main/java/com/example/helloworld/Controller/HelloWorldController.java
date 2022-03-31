package com.example.helloworld.Controller;

import com.example.helloworld.Model.HelloWorld;
import com.example.helloworld.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/")
public class HelloWorldController {

    private final HelloWorldService service;

    @Autowired
    public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

    @GetMapping
    public List<HelloWorld> getValues() {
        return service.getValues();
    }


    @GetMapping(value = "/{id}")
    public Optional<HelloWorld> getValue(@PathVariable("id") Integer id) {
        return service.getValue(id);
    }

    @PostMapping(value = "/{text}")
    public String postValue(@PathVariable("text") String text){
         return service.postValue(text);
    }

    @PutMapping(value = "/{id}")
    public String putValues(@PathVariable("id") Integer id,@RequestBody(required = true) String text){
        return service.putValue(id, text);
    }

    @DeleteMapping(value = "/{id}")
    public String  deleteValue(@PathVariable("id") Integer id)
    {
        System.out.println("called");
        return service.deleteValue(id);
    }
}
