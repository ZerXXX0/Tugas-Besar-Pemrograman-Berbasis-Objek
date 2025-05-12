/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
/**
 *
 * @author Fathan Fardian Sanum
 */
public class Reminder {
    private String message;
    private LocalDateTime time;

    public Reminder(String message, LocalDateTime time) {
        this.message = message;
        this.time = time;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setReminder(String message, LocalDateTime time) {
        this.message = message;
        this.time = time;
    }

    public void sendNotification() {
        System.out.println("Reminder: " + message + " at " + time);
    }
}
