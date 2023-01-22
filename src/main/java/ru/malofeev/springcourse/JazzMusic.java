package ru.malofeev.springcourse;


public class JazzMusic implements Music{
    private String[] tracks = {"Take Five", "So What", "Take The A Train"};

    @Override
    public String[] getSongs() {
        return tracks;
    }
}
