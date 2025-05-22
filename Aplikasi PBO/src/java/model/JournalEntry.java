/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fathan Fardian Sanum
 */
import java.time.LocalDateTime;

public class JournalEntry {
    private String content;
    private LocalDateTime entryDate;

    public JournalEntry(String content, LocalDateTime entryDate) {
        this.content = content;
        this.entryDate = entryDate;
    }
    
    public void addEntry(){
        String query = "INSERT INTO JournalEntry (content, entryDate) VALUES (?,?)";
    }
    
    public void EditEntry(){
        String query = "UPDATE JournalEntry WHERE content= ";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
    
    
}
