package org.example;

import org.springframework.stereotype.Component;

import java.util.Random;

public enum GenreOfMusic {
    CLASSICAl,
    POP,
    ROCK;

    public static GenreOfMusic RandomGenreOfMusic() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
