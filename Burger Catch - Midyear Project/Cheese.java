import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Actor
{
    private int speed = 0;
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int plateX = ((BurgerWorld)getWorld()).getPlateX();
    private int increment = 0;
    private int speed = 2;
    public Cheese(){
        GreenfootImage image = getImage();
        image.scale(150, 150);
        
    }
    public void act()
    {
<<<<<<< HEAD
        moving();
        stack();
    }
    public void moving(){
        
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
            if(speed != 0){
                 ((BurgerWorld)getWorld()).foodCount++;
                 increment += 20;
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
    public void stack(){
        if(((BurgerWorld)getWorld()).foodCount > 0 && getY()>340 - increment && getY()<350 - increment && getX()<=plateX + 70  && getX()>=plateX - 70){
            speed = 0;
        }
=======
        setLocation(getX(), getY() + speed);
        
        if (getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }
    
    public Cheese() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
>>>>>>> 7d9e130a1ca6e889ca8349742f6d8f09271429d7
    }
}
