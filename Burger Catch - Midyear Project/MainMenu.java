import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MainMenu extends World {
    public MainMenu() {
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("background.jpg"); // adjust filename as needed
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }

    private void prepare() {
        StartButton startButton = new StartButton();
        addObject(startButton, 300, 300);   
    }
}
