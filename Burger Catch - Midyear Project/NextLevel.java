import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Actor
{
    public NextLevel() {
        GreenfootImage image = new GreenfootImage("nextlevel.png");
        setImage(image);
        image.scale(140, 130);
        setLocation(200, 300);
    }
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            // Assuming a method to start the next level or restart
            //BurgerWorld world = (BurgerWorld) getWorld();
            //world.startNextLevel();
            
            Greenfoot.setWorld(new InstructionsMenuTwo());
        }
    }
}
