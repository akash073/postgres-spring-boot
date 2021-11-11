package com.dsi.kaumimadrasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String getAll(){

        String sql = "INSERT INTO students (name, email) VALUES ("
                + "'Nam Ha Minh', 'nam@codejava.net')";

        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }

        return "hello" ;
    }

}
