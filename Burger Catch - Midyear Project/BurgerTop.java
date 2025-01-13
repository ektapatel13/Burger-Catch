
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurgerTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerTop extends IngredientBase
{
    private int speed = 2;
    public BurgerTop() {
        GreenfootImage image = getImage();
        image.scale(100, 50);
        speed = 7;
    }
    /**
     * Act - do whatever the BurgerTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      moving();
        
    }
    public void moving() {
        BurgerWorld world = (BurgerWorld)getWorld();
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        
        if(((BurgerWorld)getWorld()).getScore() == 20) {
           speed = 0;
            world.setBottomHasLanded(true);
           Greenfoot.stop();
        }
        
        setLocation(getX(), getY() + speed);
        if (getY() > 390) {
            world.removeObject(this);
        }
        
       
    }
}
