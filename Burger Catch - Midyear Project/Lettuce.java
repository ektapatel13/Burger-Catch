
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lettuce here.
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
    
    private int speed = 2;
    private int plateX;
    public void addedToWorld(World w) {
        plateX = ((BurgerWorld)w).getPlateX();
    }
    public void act()
    {
        moving();
        setLocation(getX(), getY() + speed);
        
        if (getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }
    
    public Lettuce() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
    public void moving(){
        //int plateX = ((BurgerWorld)getWorld()).getPlateX();
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
        //if(getY() > 390){
            //getWorld().removeObject(this); 
        //}
    }
    
}
