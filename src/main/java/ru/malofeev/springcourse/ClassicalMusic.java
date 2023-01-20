package ru.malofeev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    private String[] tracks = {"Oh! Viragok! Oh! Illatos kert!", "By the Still Waters", "En Bateau"};

    @Override
    public String[] getSongs() {
        return tracks;
    }
}
