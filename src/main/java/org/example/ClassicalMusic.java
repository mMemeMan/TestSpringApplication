package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    private ArrayList<String> music = new ArrayList<>();

    public ClassicalMusic() {
        music.add("Hungarian Rhapsodian");
        music.add("Für Elise");
        music.add("The Four Seasons");
    }

    @Override
    public ArrayList<String> getSongs() {
        return new ArrayList<>(music);
    }

}
