
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lettuce extends Actor
{
    private int speed = 2;
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int plateX;
    private int increment = 0;
    public void addedToWorld(World w) {
        plateX = ((BurgerWorld)w).getPlateX();
    }
    public Lettuce(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
    public void act()
    {
        moving();
        stack();
        isTouchingEdge();
    }
    public void moving(){
        
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
            if(speed != 0){
                 ((BurgerWorld)getWorld()).foodCount++;
                 increment += 20;
                 //return;
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
    }
    public void isTouchingEdge() {
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
            return; 
        }
    }
    public void stack(){
        if(((BurgerWorld)getWorld()).foodCount > 0 && getY()>340 - increment && getY()<350 - increment && getX()<=plateX + 70  && getX()>=plateX - 70){
            speed = 0;
        }
        
    }
}
