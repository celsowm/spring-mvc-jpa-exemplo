package com.mycompany.naraca.model;

import javax.persistence.Entity;

@Entity
public class Audio extends Midia {
    
    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    
    
}
