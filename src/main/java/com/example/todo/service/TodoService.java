package com.example.todo.service; //declares the package for the service layer

//imports the Todo entity and repository interface
import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;

import org.springframework.stereotype.Service; //marks this class as a Spring service component

import java.util.List;

@Service //indicates that this class is a service and should be managed by Spring's dependency injection
public class TodoService {

    //repository used to interact with the database
    private final TodoRepository repo;

    //constructor-based injection for the TodoRepository
    public TodoService(TodoRepository repo) {
        this.repo = repo;
    }

    //returns a list of all Todo items from the database
    public List<Todo> getAll() {
        return repo.findAll();
    }

    //saves a new or updated Todo item to the database
    public Todo save(Todo todo) {
        return repo.save(todo);
    }

    //deletes a Todo item by its ID
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
