/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fathan Fardian Sanum
 */
public class TextNote extends Note {
    private String note;
    
    public TextNote(String note ) {
        super(title, createdDate);
        this.note = note;
    }

    public void createNote() {
        System.out.println("Creating Text Note: " + getTitle() + ", at: " + getCreatedDate());
    }
    
    public void showNote() {
        System.out.println("Text Note: " + note);
    }
    
    public void editNote() {
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
