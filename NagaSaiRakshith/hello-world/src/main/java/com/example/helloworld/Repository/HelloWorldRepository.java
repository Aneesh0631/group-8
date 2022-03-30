package com.example.helloworld.Repository;

import com.example.helloworld.Model.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorld,Integer>  {
}
