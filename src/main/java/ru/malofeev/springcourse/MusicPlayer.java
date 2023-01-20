package ru.malofeev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private String song;
    private Music music1;
    private Music music2;
    private Music music3;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(MusicGenres genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        Music[] musics = {music1, music2, music3};
        for (Music music : musics) {
            String[] musicGenres = music.getClass().getName().split("\\.");
            String musicGenre = musicGenres[musicGenres.length-1].toUpperCase();
            if (musicGenre.substring(0, musicGenre.length()-"music".length()).equals(genre.name())) {
                song = music.getSongs()[randomNumber];
            }
        }
        return "Playing: " + song;
    }
}

enum MusicGenres {
    ROCK,
    CLASSICAL,
    JAZZ
}
