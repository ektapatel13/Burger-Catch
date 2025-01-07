import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class Platee extends Actor
{
    private int speed = 5; 


    public Platee()
    {
        
        
    
    }

    public void act()
    {
        movePlate();
        //checkForCaughtItems();
    }

    
    private void movePlate()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }

        
        if (getX() < 0)
        {
            setLocation(0, getY());
        }
        
        if (getX() > getWorld().getWidth())
        {
            setLocation(getWorld().getWidth(), getY());
        }
    }

    
    private void checkForCaughtItems()
    {
        
    }

    
}
