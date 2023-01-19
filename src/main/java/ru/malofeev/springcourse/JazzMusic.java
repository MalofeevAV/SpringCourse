package ru.malofeev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    private String[] tracks = {"Take Five", "So What", "Take The A Train"};

    @Override
    public String[] getSongs() {
        return tracks;
    }
}
