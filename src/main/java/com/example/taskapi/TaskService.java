package com.example.taskapi;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service  // This tells Spring: "This class is a service, manage it for me!"
public class TaskService {

    // This is our "database" (stored in RAM)
    private final List<Task> tasks = new ArrayList<>();

    // This keeps track of the next ID to assign (starts at 1)
    private Long nextId = 1L;

    // ---------- GET all tasks ----------
    public List<Task> getAllTasks() {
        return tasks;  // Return the whole list
    }

    // ---------- CREATE a new task ----------
    public Task createTask(Task task) {
        // 1. Assign a new ID to the task
        task.setId(nextId);

        // 2. Increment the counter for the next task
        nextId++;

        // 3. Add the task to our in-memory list
        tasks.add(task);

        // 4. Return the saved task (with its new ID)
        return task;
    }
}