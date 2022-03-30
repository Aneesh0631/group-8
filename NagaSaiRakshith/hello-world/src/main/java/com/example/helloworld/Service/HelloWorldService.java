package com.example.helloworld.Service;

import com.example.helloworld.Repository.HelloWorldRepository;
import com.example.helloworld.Model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {
    private final HelloWorldRepository repository;

    @Autowired
    public HelloWorldService(HelloWorldRepository repository) {
        this.repository = repository;
    }

    public List<HelloWorld> getValue() {
        return repository.findAll();
    }

    public String setValue(String text) {
        HelloWorld helloWorld = new HelloWorld(text);
        repository.save(helloWorld);
        return "Saved Hello World in Database";
    }
}
