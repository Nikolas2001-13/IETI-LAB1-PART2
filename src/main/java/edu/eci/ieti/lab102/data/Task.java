package edu.eci.ieti.lab102.data;

import edu.eci.ieti.lab102.dto.Status;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {

        private AtomicInteger id;
        private String name;
        private String description;
        private Status status;
        private String assignedTo;
        private Date dueDate;
        private Boolean created;

        public Task() {}

}

