package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    private ArrayList<String> music = new ArrayList<>();

    public RockMusic() {
        music.add("Du hast");
        music.add("Muter");
        music.add("Die Sohner");
    }

    @Override
    public ArrayList<String> getSongs() {
        return new ArrayList<>(music);
    }
}
