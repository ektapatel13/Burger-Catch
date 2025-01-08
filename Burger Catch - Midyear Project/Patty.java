import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Patty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patty extends Actor
{
    private int speed = 0;
    /**
     * Act - do whatever the Patty wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        if (getY() >= 400) {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public Patty() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
}
