import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Plate moves left and right with the arrow keys.
 * It catches BurgerItems to increase score and stacks them visually.
 */
public class Platee extends Actor
{
    private int speed = 5; // Speed at which the plate moves horizontally


    public Platee()
    {
        // If you have a base Plate image, set it here
        // setImage("plateBase.png"); 
        // Or if you don't have a special plate image, let's just create a blank rectangle for demonstration.
    
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

        // Prevent the plate from going off the left edge
        if (getX() < 0)
        {
            setLocation(0, getY());
        }
        // Prevent going off the right edge
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
