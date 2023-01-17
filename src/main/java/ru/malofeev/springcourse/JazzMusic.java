package ru.malofeev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Fly me to the Moon";
    }
}
