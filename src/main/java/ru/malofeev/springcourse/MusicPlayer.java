package ru.malofeev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private JazzMusic jazzMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(JazzMusic jazzMusic, RockMusic rockMusic) {
        this.jazzMusic = jazzMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + jazzMusic.getSong();
    }
}
