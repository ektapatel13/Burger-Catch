
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurgerBottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerBottom extends Actor
{
    /**
     * Act - do whatever the BurgerBottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 2;
    public BurgerBottom(){
        GreenfootImage image = getImage();
        image.scale(150, 150);
    }
    public void act()
    {
        moving();
    }
    public void moving(){
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
            if(speed != 0){
                 ((BurgerWorld)getWorld()).foodCount++;
            }
            speed = 0;
            if(Greenfoot.isKeyDown("right")){
                move(4);
            }
            if(Greenfoot.isKeyDown("left")){
                move(-4);
            }
        }
        
        setLocation(getX(), getY()+speed);
        if(getY() > 390){
            getWorld().removeObject(this); 
        }
    }
}
