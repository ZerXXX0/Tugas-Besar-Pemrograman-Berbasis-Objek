/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
/**
 *
 * @author Fathan Fardian Sanum
 */
public class Alarm implements Inotifiable{
    private LocalDateTime time;
    private String status;
    
    public Alarm(LocalDateTime time, String status) {
        this.time = time;
        this.status = status;
    }
    
    public void activate(DB db) {
        String query = "INSERT INTO Alarm (status, time) VALUES ('" + this.status + "', '" + Timestamp.valueOf(this.time) + ")";
        db.runQuery(query);
        this.status = "active";
        System.out.println("Alarm activated at: " + time);

    }
    
    public void deactivate(DB db, int id) {
        String query = "DELETE FROM User WHERE id = " + id;
        db.runQuery(query);
        this.status = "inactive";
        System.out.println("Alarm deactivated at: " + time);
    }
    
    @Override
    public void sendNotification() {
        System.out.println("Sending notification: Alarm " + status + " at " + time);
    }
    
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
