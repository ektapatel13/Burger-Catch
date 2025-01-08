import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tomato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tomato extends Actor
{
<<<<<<< HEAD

    private int speed = 2;
=======
    private int speed = 0;
>>>>>>> 7d9e130a1ca6e889ca8349742f6d8f09271429d7
    /**
     * Act - do whatever the Tomato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tomato(){
        GreenfootImage image = getImage();
        image.scale(120, 120);
    }
    public void act()
    {
<<<<<<< HEAD
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
=======
        setLocation(getX(), getY() + speed);
        
        if (getY() >= 400) {
            getWorld().removeObject(this);
        }
    }
    
    public Tomato() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
>>>>>>> 7d9e130a1ca6e889ca8349742f6d8f09271429d7
    }
}
