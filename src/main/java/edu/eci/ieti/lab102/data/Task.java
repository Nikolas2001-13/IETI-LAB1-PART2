package edu.eci.ieti.lab102.data;

import edu.eci.ieti.lab102.dto.Status;
import edu.eci.ieti.lab102.dto.TaskDto;

import java.util.Date;

public class Task {

        private String id;
        private String name;
        private String description;
        private Status status;
        private String assignedTo;
        private Date dueDate;
        private Boolean created;

        public Task(TaskDto taskDto) {
                this.name = taskDto.getName();
                this.description = taskDto.getDescription();
                this.status = taskDto.getStatus();
                this.assignedTo = taskDto.getAssignedTo();
                this.dueDate = taskDto.getDueDate();
                this.created = taskDto.getCreated();
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Status getStatus() {
                return status;
        }

        public void setStatus(Status status) {
                this.status = status;
        }

        public String getAssignedTo() {
                return assignedTo;
        }

        public void setAssignedTo(String assignedTo) {
                this.assignedTo = assignedTo;
        }

        public Date getDueDate() {
                return dueDate;
        }

        public void setDueDate(Date dueDate) {
                this.dueDate = dueDate;
        }

        public Boolean getCreated() {
                return created;
        }

        public void setCreated(Boolean created) {
                this.created = created;
        }
}

