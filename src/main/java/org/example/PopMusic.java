package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PopMusic implements Music {
    private ArrayList<String> music = new ArrayList<>();

    public PopMusic() {
        music.add("Poker Face");
        music.add("Lonely");
        music.add("Danza kuduro");
    }

    @Override
    public ArrayList<String> getSongs() {
        return new ArrayList<>(music);
    }
}
