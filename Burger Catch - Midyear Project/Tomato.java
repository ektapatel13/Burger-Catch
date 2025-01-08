import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tomato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tomato extends Actor
{
    private int speed = 0;
    /**
     * Act - do whatever the Tomato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        if (getY() >= 400) {
            getWorld().removeObject(this);
        }
    }
    
    public Tomato() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
}
