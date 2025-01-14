
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurgerTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerTop extends IngredientBase
{
    protected int speed = Greenfoot.getRandomNumber(3) + 2;
    protected boolean didScore = false;
    
    
    /**
     * Act - do whatever the BurgerTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BurgerTop(){
        GreenfootImage image = getImage();
        image.scale(100, 60);
        //speed = Greenfoot.getRandomNumber(3) + 2;
    }
    public void act() {
        moving();
        isTouchingEdge();
    }
    
    public void moving() {
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        if ((getY() >= ((BurgerWorld)getWorld()).getStackHeight() && getY() <=345 && getX() <=plateX + 60 && getX() >= plateX - 60)) {
            speed = 0;
            //((BurgerWorld)getWorld()).addScore(1);
            // speed = 0 in if statement if things still aren't working
            if(didScore == false) {
                //((BurgerWorld)getWorld()).addScore(1);
                didScore = true;
                ((BurgerWorld)getWorld()).levelCompleted();
            }
            if (Greenfoot.isKeyDown("right")) {
                move(8);
            }
            if(Greenfoot.isKeyDown("left")) {
                move(-8);
            }
        }
        
        setLocation(getX(), getY() + speed);
    }
    
    public void isTouchingEdge() {
        if (getY() > 390) {
            //((BurgerWorld)getWorld()).addScore(-1);
            getWorld().removeObject(this);
            return;
        }
    }
    }

