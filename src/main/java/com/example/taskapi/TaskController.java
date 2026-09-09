package com.example.taskapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")  // All endpoints in this class start with /tasks
public class TaskController {

    // Inject the TaskService (Spring creates it and gives it to us)
    private final TaskService taskService;

    // Constructor injection (the recommended way)
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // ---------- GET /tasks ----------
    // Returns a list of all tasks
    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    // ---------- POST /tasks ----------
    // Creates a new task from the JSON in the request body
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        // @RequestBody tells Spring: "Take the incoming JSON and convert it to a Task object"
        return taskService.createTask(task);
    }

    // ---------- (Bonus) GET /tasks/health ----------
    // We can keep our old health check too!
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }
}