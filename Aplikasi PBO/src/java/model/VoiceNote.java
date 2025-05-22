    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * @author Fathan Fardian Sanum
 */
public class VoiceNote extends Note{
    private String path;
    private Player player;
    
    public VoiceNote(String path){
        super();
        this.path = path;
    }
    
    public void play(){
        try{
            InputStream inputsStream = new FileInputStream(path);
            player = new Player(inputStream);
            player.play();
        } catch (FileNothoe FoundException e){
            System.out.println(path);
        } catch (Exception e){
            System.out.println(e.getMessage());
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
}
