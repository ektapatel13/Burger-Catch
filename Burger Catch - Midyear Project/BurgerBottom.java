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

    /**
     * Act - do whatever the BurgerBottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BurgerBottom() {
        GreenfootImage image = getImage();
        image.scale(130, 130);
        speed = Greenfoot.getRandomNumber(3) + 2;
    }
    public void act()
    {
        moving();
    }
    public void moving() {
        BurgerWorld world = (BurgerWorld)getWorld();
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70) {
            speed = 0;
            world.setBottomHasLanded(true);
            if(Greenfoot.isKeyDown("right")) {
                move(5);
            }
            if(Greenfoot.isKeyDown("left")) {
                move(-5);
            }
        }
        
        setLocation(getX(), getY() + speed);
        if (getY() > 390) {
            world.removeObject(this);
        }
    }
}
