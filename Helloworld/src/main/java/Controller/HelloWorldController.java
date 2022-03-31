package Controller;
import com.example.Helloworld.HelloworldApplication;
import Model.HelloWorld;
import Repository.Group8Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {
    @Autowired
    private Group8Repo group8;

    @GetMapping("hello")
    public List<HelloWorld> getAllHelloWorld() {
        return this.group8.findAll();
    }


    @PostMapping("hello1")
    public HelloWorld createHello(@RequestBody HelloWorld helloworld) {
        return group8.save(helloworld);
    }
}
