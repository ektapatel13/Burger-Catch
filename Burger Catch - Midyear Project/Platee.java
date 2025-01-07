import greenfoot.*;

public class Platee extends Actor
{
    public void act() {
        
    }
    
    public void moveKeys() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-2, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+2, getY());
        }
    }
    
}
