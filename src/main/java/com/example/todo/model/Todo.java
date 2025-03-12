package com.example.todo.model;

public class Todo {
    private String id;
    private String title;
    private boolean completed;

    // Getter method for id
    public String getId() {
        return id;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for completed
    public boolean isCompleted() {
        return completed;
    }

    // Constructor
    public Todo(String id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}