package edu.eci.ieti.lab102.service.impl;

import edu.eci.ieti.lab102.data.Task;
import edu.eci.ieti.lab102.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private HashMap<String, Task> userHashMap = new HashMap<>();

    public TaskServiceHashMap(){}

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task findById(String id) {
        return null;
    }

    @Override
    public List<Task> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public Task update(Task task, String id) {
        return null;
    }
}
