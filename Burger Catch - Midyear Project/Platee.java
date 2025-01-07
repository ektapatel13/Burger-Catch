import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Plate moves left and right with the arrow keys.
 * It catches BurgerItems to increase score and stacks them visually.
 */
public class Platee extends Actor
{
    private int speed = 5; 


    public Platee()
    {
        
        setImage("plateBase.png"); 
        
    
    }

    public void act()
    {
        movePlate();
        //checkForCaughtItems();
    }

    /**
     * Move the plate left or right based on arrow key presses.
     */
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

    /**
     * Checks if the plate intersects any BurgerItem.
     * If so, increment the score, add the item type to our stack, and remove that item.
     */
    private void checkForCaughtItems()
    {
        
    }

    
}
