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
        image.scale(300, 300);
    }
    public void prepare() {
        
    }
    
    public void moveKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-4, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+4, getY());
        }
    }
    
}
