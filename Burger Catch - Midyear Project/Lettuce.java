
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lettuce extends Actor
{
    
    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< Updated upstream
    private int speed;
=======
    private int plateX;
    private int increment = 0;
    
    
>>>>>>> Stashed changes
    public Lettuce(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(3) + 2;
    }
    
    public void act()
    {
        moving();
<<<<<<< Updated upstream
        isTouchingEdge();
    }
=======
        
        isTouchingEdge();
    }
    
    public void moving(){
        
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
            if(speed != 0){
                 ((BurgerWorld)getWorld()).foodCount++;
                 increment += 20;
                 //return;
            }
>>>>>>> Stashed changes
    
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
