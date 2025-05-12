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

public class Activity extends Task {
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor to initialize an Activity
    public Activity(String title, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(title);
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Constructor for retrieving Activity from the database
    public Activity(int id, String title, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(title);
        this.setId(id);
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and setter for startTime
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    // Getter and setter for endTime
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    // Implement the abstract setReminder method
    @Override
    public void setReminder() {
        System.out.println("Setting reminder for Activity: " + getTitle());
    }

    // Insert the Activity into the database
    public void insertActivity(DB db) {
        String query = "INSERT INTO Activity (title, description, start_time, end_time, task_id) VALUES ('" + this.getTitle() + "', '" + this.description + "', '" + Timestamp.valueOf(this.startTime) + "', '" + Timestamp.valueOf(this.endTime) + "', " + this.getId() + ")";
        db.runQuery(query);
    }

    // Get the Activity by ID from the database
    public static Activity getActivityById(DB db, int id) {
        Activity activity = null;
        String query = "SELECT * FROM Activity WHERE id = " + id;
        ResultSet rs = db.getData(query);
        try {
            if (rs.next()) {
                activity = new Activity(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
                        rs.getTimestamp("start_time").toLocalDateTime(), rs.getTimestamp("end_time").toLocalDateTime());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return activity;
    }
}