
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Actor
{
    
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< Updated upstream
    private int speed;
=======
    private int plateX;
    private int increment = 0;
    
    
>>>>>>> Stashed changes
    public Cheese(){
        GreenfootImage image = getImage();
        image.scale(130, 130);
        speed = Greenfoot.getRandomNumber(3) + 2;
    }
    
    public void act()
    {
        moving();
<<<<<<< Updated upstream
        isTouchingEdge();
=======
        
        isTouchingEdge();
        
    }
    
    public void moving(){
>>>>>>> Stashed changes
        
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
<<<<<<< Updated upstream
=======
    //public void stack(){
        //if(((BurgerWorld)getWorld()).foodCount > 0 && getY()>340 - increment && getY()<350 - increment && getX()<=plateX + 70  && getX()>=plateX - 70){
            //speed = 0;
        //}
        
    //}
>>>>>>> Stashed changes
}
