import greenfoot.*;

public class Platee extends Actor
{
    public void act() {
        
    }
    public Platee() {
        GreenfootImage image = getImage();
        image.scale(150, 150);
    }
    public void prepare() {
        
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
