import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Actor
{
    private int speed = 0;
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        if (getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }
    
    public Cheese() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
}
