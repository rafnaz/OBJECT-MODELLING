package com.crio.jukebox.entities;

import com.crio.jukebox.exceptions.SongNotFoundException;

public class UserPlaylistCurrentSong {
    private Playlist playlist;
    private Song currSong;
    
    //constructor

    public UserPlaylistCurrentSong(){
    }
    
    public UserPlaylistCurrentSong(Playlist p, Song s){
        this.playlist = p;
        if(p.checkIfSongExist(s)){
            this.currSong = s;
        } else {
            throw new SongNotFoundException("Song ID is not part of a current active playlist.");
        } 
    }

    //Behaviours
    public Playlist getActivePlaylist(){
        return playlist;
    }

    public Song getCurrentSong(){
        return currSong;
    }

    @Override
    public String toString() {
        return "UserPlaylistCurrentSong [plalist=" + playlist + "song="+ currSong + "]";
    }

}
