/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fathan Fardian Sanum
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class JournalEntry {
    private int id;
    private String content;
    private LocalDateTime entryDate;

    public JournalEntry(int id, String content, LocalDateTime entryDate) {
        this.id = id;
        this.content = content;
        this.entryDate = entryDate;
    }
    
    public void addEntry(DB db){
        String query = "INSERT INTO JournalEntry (content, entryDate, JournalId) VALUES ('" + this.getContent() + "', '" + Timestamp.valueOf(this.entryDate) + "','" + this.id + "')";
        db.runQuery(query);
    }
    
    public void editEntry(DB db, int id){
        String query = "UPDATE INTO JournalEntry SET content = '" + this.getContent() + "', entryDate = '" + Timestamp.valueOf(this.entryDate) + "' WHERE id = " + id;
        db.runQuery(query);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
    
    public static JournalEntry getJournalEntrybyId(DB db, int id) {
        JournalEntry journalEntry = null;
        String query = "SELECT * FROM JournalEntry WHERE id = " + id;
        ResultSet rs = db.getData(query);
        try {
            if (rs.next()) {
                journalEntry = new JournalEntry(rs.getInt("id"), rs.getString("content"), rs.getTimestamp("entryDate").toLocalDateTime());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return journalEntry;
    }
    
    
}
