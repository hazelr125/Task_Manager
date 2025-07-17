package com.example.todo; //declares the package name for the application

//imports required Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//marks the main class of a Spring Boot application
//enables component scanning, auto-configuration, and configuration setup
@SpringBootApplication
public class TodoAppApplication {

    // main method: the entry point of the Java application
    public static void main(String[] args) {
        //launches the Spring Boot application
        SpringApplication.run(TodoAppApplication.class, args);
    }

}
