
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IngredientBase extends Actor {
    protected int speed = Greenfoot.getRandomNumber(3) + 1;
    protected boolean didScore = false;
    
    public void act() {
        moving();
        isTouchingEdge();
    }
    public void moving() {
        int plateX = ((BurgerWorld)getWorld()).getPlateX();
        if (speed == 0 || (getY() >= ((BurgerWorld)getWorld()).getStackHeight() && getY() <= 350 && getX() <= plateX + 70 && getX() >= plateX-70)) {
            speed=0;
            ((BurgerWorld)getWorld()).increaseStackHeight(-15);
            if(didScore == false) {
               ((BurgerWorld)getWorld()).addScore(1); 
               didScore = true;
            }
            if (Greenfoot.isKeyDown("left")) {
                move(-8);
            }
            if (Greenfoot.isKeyDown("right")) {
                move(8);
            }
        }
        setLocation(getX(), getY()+speed);
    }
    public void isTouchingEdge() {
        if (getY() > 390) {
            ((BurgerWorld)getWorld()).addScore(-1);
            getWorld().removeObject(this);
        }
    }
    public void isTouchingTop() {
        if (getY() < 20) {
            ((BurgerWorld)getWorld()).gameLost();
        }
    }
}
