package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {
    }

    public void playMusic(GenreOfMusic genreOfMusic) {
        String music = "";
        ArrayList<String> musicList;
        switch (genreOfMusic) {
            case CLASSICAl:
                musicList = classicalMusic.getSongs();
                music = musicList.get((int) (Math.random() * musicList.size()));
                break;
            case POP:
                musicList = popMusic.getSongs();
                music = musicList.get((int) (Math.random() * musicList.size()));
                break;
            case ROCK:
                musicList = rockMusic.getSongs();
                music = musicList.get((int) (Math.random() * musicList.size()));
        }
        System.out.println("Playing: " + music);
    }
}
