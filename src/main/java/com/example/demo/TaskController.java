package com.example.demo;

import com.example.demo.data.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class TaskController {
    ArrayList<Task> task;
    public TaskController(){
        this.task=new ArrayList<>();
        this.task.add(new Task("complete redux", String.valueOf(new Date()),false ));
        this.task.add(new Task("complete task apis", String.valueOf(new Date()),false ));
    }
    @GetMapping("/")
    public ArrayList<Task> getAllTasks(){
        return task;
    }
    @GetMapping("/task")
    public String userName(){
        return "Raj";
    }
}
