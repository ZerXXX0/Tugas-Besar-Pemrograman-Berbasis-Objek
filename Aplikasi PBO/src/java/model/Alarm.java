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
public class Alarm implements Inotifiable{
    private LocalDateTime time;
    private String status;
    
    public Alarm(LocalDateTime time, String status) {
        this.time = time;
        this.status = status;
    }
    
    public void activate() {
        
    }
    
    public void deactivate() {
        
    }
    
    @Override
    public void sendNotification() {
        
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
