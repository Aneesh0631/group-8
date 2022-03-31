package com.example.helloworld.Service;

import com.example.helloworld.Repository.HelloWorldRepository;
import com.example.helloworld.Model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class HelloWorldService {
    private final HelloWorldRepository repository;

    @Autowired
    public HelloWorldService(HelloWorldRepository repository) {
        this.repository = repository;
    }

    public List<HelloWorld> getValues() {
        return repository.findAll();
    }

    public Optional<HelloWorld> getValue(Integer id){
        boolean exists = repository.existsById(id);
        if (!exists)
            throw new IllegalStateException(id + " does not exists");
        return repository.findById(id);
    }

    public String postValue(String text) {
        HelloWorld helloWorld = new HelloWorld(text);
        repository.save(helloWorld);
        return String.format("Saved '%s' in Database", text);
    }

    public String putValue(Integer id, String text) {
        boolean exists = repository.existsById(id);
        if (!exists)
            throw new IllegalStateException(id + " does not exists");
        HelloWorld helloWorld = repository.getById(id);
        helloWorld.setText(text);
        repository.save(helloWorld);
        return "updated text of id:" + id;
    }

    public String deleteValue(Integer id) {
        boolean exists = repository.existsById(id);
        if (!exists)
            throw new IllegalStateException(id + " does not exists");
        repository.deleteById(id);
        return "Deleted value of id: " + id;
    }

}
