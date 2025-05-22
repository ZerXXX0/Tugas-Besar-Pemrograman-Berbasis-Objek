    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author Fathan Fardian Sanum
 */
public class VoiceNote extends Note{
    private String path;
    private Player player;
    private int id;
    
    
    public VoiceNote(int id, String title, LocalDateTime createdDate, String path) {
        super(title, createdDate);
        this.id = id; // if your Note class or table has primary key
        this.path = path;
    }
    
    public void play() {
        try {
            InputStream inputStream = new FileInputStream(path);
            player = new Player(inputStream);
            player.play();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void stop(){
        if(player != null){
            player.close();
            System.out.println("Playback stopped.");
        }
    }
    
    public String getPath() {
        return path;
    }

    @Override
    public void createNote(DB db) {
        String query;
        query = "INSERT INTO VoiceNote (title, createdDate, path) VALUES ('"
                + getTitle() + "', '"
                + Timestamp.valueOf(getCreatedDate()) + "', '"
                + this.path + "')";
        db.runQuery(query);
        System.out.println("Creating Text Note: " + getTitle() + ", at: " + getCreatedDate());// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
