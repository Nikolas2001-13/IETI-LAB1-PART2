package edu.eci.ieti.lab102.controller;

import edu.eci.ieti.lab102.data.Task;
import edu.eci.ieti.lab102.dto.TaskDto;
import edu.eci.ieti.lab102.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(taskService.all());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping( "/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(taskService.findById(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping
    public  ResponseEntity<Task> create(@RequestBody TaskDto taskDto){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(taskService.create(new Task(taskDto)));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(taskService.update(new Task(taskDto), id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id )
    {
        try {
            taskService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }

}
