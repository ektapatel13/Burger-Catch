import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
    public ExitButton() {
        GreenfootImage image = new GreenfootImage("exitbutton.png");
        setImage(image);
        image.scale(200, 200);
        setLocation(200, 400);
    }
    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            // Assuming a method to start the next level or restart
            BurgerWorld world = (BurgerWorld) getWorld();
            world.startNextLevel();
        }
    }
}
