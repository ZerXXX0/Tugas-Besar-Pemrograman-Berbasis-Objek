/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public ToDoItem(int id, String title, LocalDateTime dueDate, int priority) {
        super(title);
        this.setId(id);
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

    public void insertToDoItem(DB db) {
        String query = "INSERT INTO ToDoItem (title, due_date, priority, task_id) VALUES ('" + this.getTitle() + "', '" + Timestamp.valueOf(this.dueDate) + "', " + this.priority + ", " + this.getId() + ")";
        db.runQuery(query);
    }

    public static ToDoItem getToDoItemById(DB db, int id) {
        ToDoItem toDoItem = null;
        String query = "SELECT * FROM ToDoItem WHERE id = " + id;
        ResultSet rs = db.getData(query);
        try {
            if (rs.next()) {
                toDoItem = new ToDoItem(rs.getInt("id"), rs.getString("title"), rs.getTimestamp("due_date").toLocalDateTime(), rs.getInt("priority"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return toDoItem;
    }
}