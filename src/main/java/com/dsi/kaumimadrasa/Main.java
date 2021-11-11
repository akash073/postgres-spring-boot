package com.dsi.kaumimadrasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String getAll(){
        return "hello" ;
    }

}
