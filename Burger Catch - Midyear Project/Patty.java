
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patty extends Actor
{
    private int speed = 2;
    
    public Patty(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(3) + 2;
    }
    public void act()
    {
        moving();
        isTouchingEdge();
    }
public void moving(){
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        if(getY() > 350 && getY() < 360 && getX() <= plateX + 70 && getX() >= plateX - 70){
            speed = 0;
            if(Greenfoot.isKeyDown("right")){
                move(5);
            }
            if(Greenfoot.isKeyDown("left")){
                move(-5);
            }
        }
        
        setLocation(getX(), getY()+speed);

    }
    public void isTouchingEdge() {
        if (getY() > 390) {
            getWorld().removeObject(this);
            return; 
        }
    }
    
}
