/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fathan Fardian Sanum
 */
public class Reminder implements Inotifiable {
    private int id;
    private String message;
    private LocalDateTime time;
    private int taskId;

    // Constructor for creating a new reminder
    public Reminder(String message, LocalDateTime time) {
        this.message = message;
        this.time = time;
    }

    // Constructor for retrieving an existing reminder from the database
    public Reminder(int id, String message, LocalDateTime time, int taskId) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.taskId = taskId;
    }

    // Getter and setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and setter for time
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    // Setter method to set both message and time at once
    public void setReminder(String message, LocalDateTime time) {
        this.message = message;
        this.time = time;
    }

    // Getter for taskId
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    // Method to send notifications (as defined in Inotifiable)
    @Override
    public void sendNotification() {
        System.out.println("Reminder: " + message + " at " + time);
    }

    // Insert reminder into the database
    public void insertReminder(DB db) {
        String query = "INSERT INTO Reminder (message, time, task_id) VALUES ('" + this.message + "', '" + Timestamp.valueOf(this.time) + "', " + this.taskId + ")";
        db.runQuery(query);
    }

    // Retrieve reminder by ID from the database
    public static Reminder getReminderById(DB db, int id) {
        Reminder reminder = null;
        String query = "SELECT * FROM Reminder WHERE id = " + id;
        ResultSet rs = db.getData(query);
        try {
            if (rs.next()) {
                reminder = new Reminder(rs.getInt("id"), rs.getString("message"), rs.getTimestamp("time").toLocalDateTime(), rs.getInt("task_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reminder;
    }
}
