package ru.malofeev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " \n " + musicPlayer.getVolume());

        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music1 == music2);

        Music music3 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(Arrays.toString(music3.getSongs()));

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
