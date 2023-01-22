package ru.malofeev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> music;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> music) {
        this.music= music;
    }

    public String playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        return "Playing: " + music.get(randomNumber).getSongs()[randomNumber];
    }
}
