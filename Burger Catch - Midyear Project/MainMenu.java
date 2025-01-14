import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MainMenu extends World {
    public MainMenu() {
        super(660, 400, 1); 
        prepare();
    }

    private void prepare() {
        StartButton startButton = new StartButton();
        addObject(startButton, 330, 300);   
    }
}
