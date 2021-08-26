package edu.eci.ieti.lab102.dto;

import java.util.Date;

public class TaskDto {

    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Boolean created;

    public TaskDto() {}
}
