/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Fathan Fardian Sanum
 */

public class ToDoItem extends Task {
    private LocalDateTime dueDate;
    private int priority;
    
    public ToDoItem(String title, LocalDateTime dueDate, int priority) {
        super(title);
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void markComplete() {
        System.out.println("Task '" + getTitle() + "' marked as completed.");
    }
    
    @Override
    public void setReminder() {
        System.out.println("Setting reminder for ToDoItem: " + getTitle());
    }
}
