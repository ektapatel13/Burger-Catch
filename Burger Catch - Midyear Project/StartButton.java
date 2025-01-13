import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor {
    public StartButton() {
        GreenfootImage image = new GreenfootImage("startbutton.png");
        setImage(image);
        image.scale(200, 200);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InstructionsMenu());
        }
    }
}
