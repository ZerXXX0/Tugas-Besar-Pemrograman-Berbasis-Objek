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
public abstract class Task {
    private int id;  // Untuk Database
    private String title;
    private Reminder reminder;

    public Task(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public void setReminder(String message, LocalDateTime time) {
        this.reminder = new Reminder(message, time);
    }

    public abstract void setReminder();

    public void insertTask(DB db) {
        String query = "INSERT INTO Task (title) VALUES ('" + this.title + "')";
        db.runQuery(query);
    }

    public static Task getTaskById(DB db, int taskId) {
        Task task = null;
        String query = "SELECT * FROM Task WHERE id = " + taskId;
        ResultSet rs = db.getData(query);
        try {
            if (rs.next()) {
                task = new Task(rs.getString("title")) {
                    @Override
                    public void setReminder() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };
                task.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }
}
