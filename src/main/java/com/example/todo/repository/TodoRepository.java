package com.example.todo.repository; //declares the package for the repository layer

import com.example.todo.model.Todo; //imports the Todo entity
import org.springframework.data.jpa.repository.JpaRepository; //imports JpaRepository to provide CRUD operations

// this interface acts as a Data Access Layer for the Todo entity.
// by extending JpaRepository, it inherits basic CRUD methods like save(), findAll(), findById(), deleteById(), etc.
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // no additional methods are required here for basic CRUD functionality.
    // JpaRepository<Todo, Long> takes two parameters:
    // - Todo: the entity type
    // - Long: the type of the primary key (ID) of the entity
}
