package com.example.taskmanager;

public class Task {
    private long id;
    private String name;
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(long id, String name, String description,
            String dueDate, boolean completed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
