
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plate extends Actor
{
    public void act() {
        moveKeys();
    }
    public Plate() {
        GreenfootImage image = getImage();
        image.scale(150, 150);
    }
    public void prepare() {
        
    }
    
    public void moveKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-6, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+6, getY());
        }
    }
    
}
