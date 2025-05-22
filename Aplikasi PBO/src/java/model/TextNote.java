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
public class TextNote extends Note {
    private String note;
    
    public TextNote(String title, LocalDateTime createdDate, String note) {
        super(title, createdDate);
        this.note = note;
    }
    
    @Override
    public void createNote(DB db){
        String query = "INSERT INTO TextNote (title, createdDate, note) VALUES ('"
                + getTitle() + "', '"
                + Timestamp.valueOf(getCreatedDate()) + "', '"
                + this.note + "')";
        db.runQuery(query);
        System.out.println("Creating Text Note: " + getTitle() + ", at: " + getCreatedDate());

        
    public void showNote(){
        System.out.println("Text Note: " + this.note);
    }
    
    
    public void editNote(DB db, String newNote) {
        String query = "UPDATE TextNote SET note ='" + this.note + "' WHERE title ='" + getTitle() + "'";
        db.runQuery(query);
        this.note = newNote;
        System.out.println("Text Note edited: " + note);
        }
    }
    
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
