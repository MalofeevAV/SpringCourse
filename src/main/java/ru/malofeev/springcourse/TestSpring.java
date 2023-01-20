package ru.malofeev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " \n " + musicPlayer.getVolume());

        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music1 == music2);

        Music music3 = context.getBean("rockMusic", RockMusic.class);

        context.close();
    }
}
