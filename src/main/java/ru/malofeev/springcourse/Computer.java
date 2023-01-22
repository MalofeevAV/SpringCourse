package ru.malofeev.springcourse;

import java.util.Random;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private Random random = new Random();

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        int randomNumber = random.nextInt(3);

        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
