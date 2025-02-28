import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurgerBottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerBottom extends Actor
{
    private int speed = 2;
    private int x = 0;

    /**
     * Act - do whatever the BurgerBottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BurgerBottom() {
        GreenfootImage image = getImage();
        image.scale(130, 130);
        speed = 7;
    }
    public void act()
    {
        moving();
        isTouchingEdge();
    }
    public void moving() {
        BurgerWorld world = (BurgerWorld)getWorld();
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        
        if(getY() >= ((BurgerWorld)getWorld()). getStackHeight() && getX() <= plateX + 70 && getX() >= plateX - 70) {
            speed = 0;
            ((BurgerWorld)getWorld()).updateStackHeight(getY() - 15);
            if(Greenfoot.isKeyDown("right")) {
                move(8);
            }
            if(Greenfoot.isKeyDown("left")) {
                move(-8);
            }
        }
        
        setLocation(getX(), getY() + speed);
        if (getY() > 390) {
            world.removeObject(this);
        }
    }
    public void isTouchingEdge() {
        if (getY() > 390) {
            ((BurgerWorld)getWorld()).addScore(-1);
            getWorld().removeObject(this);
            return; 
        }
        
    }
}
