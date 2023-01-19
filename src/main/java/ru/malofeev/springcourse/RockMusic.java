package ru.malofeev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private String[] tracks = {"Whole Lotta Love", "Under Pressure", "Comfortably Numb"};

    @Override
    public String[] getSongs() {
        return tracks;
    }
}
