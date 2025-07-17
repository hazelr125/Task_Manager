package com.example.todo.controller; //declares the package for the controller layer

import com.example.todo.model.Todo;             //imports the Todo model class
import com.example.todo.service.TodoService;    // imports the service to handle business logic
import org.springframework.stereotype.Controller; // marks this class as a Spring MVC Controller
import org.springframework.ui.Model;              // used to pass data to the view (HTML template)
import org.springframework.web.bind.annotation.*; // imports annotations for mapping web requests

//marks this class as a controller to handle HTTP requests and return views (e.g., HTML templates)
@Controller
public class TodoController {

    // injects the service layer to handle business logic
    private final TodoService service;

    // constructor-based dependency injection
    public TodoController(TodoService service) {
        this.service = service;
    }

    // handles GET requests to the root URL ("/")
    @GetMapping("/")
    public String home(Model model) {
        // adds the list of todos to the model to be displayed in the view
        model.addAttribute("todos", service.getAll());
        // adds a new empty Todo object to bind the form input
        model.addAttribute("todo", new Todo());
        // returns the index.html
        return "index";
    }

    // handles POST requests to "/add" when a user submits a new todo
    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        //saves the new todo using the service layer
        service.save(todo);
        //redirects back to the homepage to show updated list
        return "redirect:/";
    }

    //handles GET requests to "/delete/{id}" to delete a todo
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        //deletes the todo with the specified ID
        service.delete(id);
        //redirects back to the homepage to show updated list
        return "redirect:/";
    }
}
