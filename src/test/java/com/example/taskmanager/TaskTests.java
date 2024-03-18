package com.example.taskmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTests {
    @Test
    public void testTaskCreation() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        assertEquals(1, task.getId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task", task.getDescription());
        assertEquals("2022-12-31", task.getDueDate());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testSetId() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        task.setId(2);
        assertEquals(2, task.getId());
    }

    @Test
    public void testSetName() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        task.setName("New Task Name");
        assertEquals("New Task Name", task.getName());
    }

    @Test
    public void testSetDescription() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        task.setDescription("New Task Description");
        assertEquals("New Task Description", task.getDescription());
    }

    @Test
    public void testSetDueDate() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        task.setDueDate("2023-01-01");
        assertEquals("2023-01-01", task.getDueDate());
    }

    @Test
    public void testSetCompleted() {
        Task task = new Task(1, "Test Task", "This is a test task", "2022-12-31", false);
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }
}