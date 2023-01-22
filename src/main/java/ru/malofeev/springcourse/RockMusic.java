package ru.malofeev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class RockMusic implements Music{
    private String[] tracks = {"Whole Lotta Love", "Under Pressure", "Comfortably Numb"};

    @PostConstruct
    public void doMyInitialise() {
        System.out.println("Initialise");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String[] getSongs() {
        return tracks;
    }
}
