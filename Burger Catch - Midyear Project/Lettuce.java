import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lettuce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lettuce extends Actor
{
    private int speed = 0;
    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        if (getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }
    
    public Lettuce() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
}
