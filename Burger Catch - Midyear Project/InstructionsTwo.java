import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsTwo extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InstructionsTwo() {
        GreenfootImage image = new GreenfootImage("instructions two.png");
        setImage(image);
        image.scale(300, 400);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new BurgerWorldTwo());
        }
    }
}
