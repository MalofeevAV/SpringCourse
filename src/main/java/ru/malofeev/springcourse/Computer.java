package ru.malofeev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private Random random = new Random();

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        int randomNumber = random.nextInt(3);

        return "Computer " + id + " " + musicPlayer.playMusic(MusicGenres.values()[randomNumber]);
    }
}
