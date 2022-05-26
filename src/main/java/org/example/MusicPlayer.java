package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
