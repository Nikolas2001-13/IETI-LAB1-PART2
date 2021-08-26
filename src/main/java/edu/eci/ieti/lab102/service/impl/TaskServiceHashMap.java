package edu.eci.ieti.lab102.service.impl;

import edu.eci.ieti.lab102.data.Task;
import edu.eci.ieti.lab102.exception.TaskException;
import edu.eci.ieti.lab102.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TaskServiceHashMap implements TaskService {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private HashMap<String, Task> taskHashMap = new HashMap<>();

    public TaskServiceHashMap(){}

    @Override
    public Task create(Task task) {
        task.setId(String.valueOf(ID_GENERATOR.getAndIncrement()));
        taskHashMap.put(task.getId(),task);
        return task;
    }

    @Override
    public Task findById(String id) throws TaskException {

        if(taskHashMap.containsKey(id)){
            return taskHashMap.get(id);
        }
        throw new TaskException(TaskException.USER_NOT_FOUND);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public void deleteById(String id) {
        taskHashMap.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        task.setId(id);
        taskHashMap.replace(id,task);
        return  task;
    }
}
