package ru.malofeev.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    private void doInit() {
        System.out.println("Initialisation ClassicalMusic");
    }

    private void doDestroy(){
        System.out.println("Destruction ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
