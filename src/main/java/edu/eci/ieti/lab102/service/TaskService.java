package edu.eci.ieti.lab102.service;

import edu.eci.ieti.lab102.data.Task;
import edu.eci.ieti.lab102.exception.TaskException;

import java.util.List;

public interface TaskService {

    Task create(Task task );

    Task findById( String id ) throws TaskException;

    List<Task> all();

    void deleteById( String id );

    Task update( Task task, String id );
}
