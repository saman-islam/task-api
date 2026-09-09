package com.example.taskapi;

public class Task {

    // Fields (private = hidden from other classes)
    private Long id;
    private String title;
    private TaskStatus status; // Using the Enum we just made!

    // Constructor (used to create a new Task object)
    public Task() {
        // Empty constructor needed for Spring to convert JSON to Java object
    }

    public Task(Long id, String title, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    // ---------- Getters and Setters ----------
    // (These let other classes read and update the private fields)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}

