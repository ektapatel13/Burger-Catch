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

    // We'll store the item types caught in this list (like a stack).
    private List<String> caughtItems = new ArrayList<String>();

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

    /**
     * Rebuild the plate's image to show all caught items stacked visually.
     */
    private void rebuildPlateImage()
    {
        // Let's create a "stack" image that is tall enough for all items plus the base plate.
        int itemHeight = 20;   // how tall each item should be visually
        int plateHeight = 30;  // base plate height (in our example constructor)
        int totalHeight = plateHeight + itemHeight * caughtItems.size();

        // We'll keep the width at 100 for simplicity
        GreenfootImage newPlate = new GreenfootImage(100, totalHeight);

        // Draw the base rectangle for the plate at the bottom
        newPlate.setColor(Color.GRAY);
        newPlate.fillRect(0, totalHeight - plateHeight, 100, plateHeight);

        // Now, for each caught item, draw its image above the base
        // We'll do it in order from bottom to top
        int yPos = totalHeight - plateHeight; // start above the plate
        for (int i = 0; i < caughtItems.size(); i++)
        {
            // The item type we want to draw
            String type = caughtItems.get(i);

            // Load the appropriate image
            // Alternatively, you could store scaled images or a dictionary if you prefer.
            GreenfootImage itemImg = getStackImage(type);

            // Scale it if desired (e.g., 80x20).
            // itemImg.scale(80, 20);

            // Decrease yPos by the item’s height before drawing it
            yPos -= itemHeight;

            // Draw it on the newPlate image at x=10 for centering (ish)
            newPlate.drawImage(itemImg, 10, yPos);
        }

        // Now set the newPlate as the actor's image
        setImage(newPlate);
    }

    /**
     * Returns a small image to use for the stacked item (different from the falling image).
     * Or you could just load the same image again from your file. 
     */
    private GreenfootImage getStackImage(String type)
    {
        // Option 1: return a small, custom image
        if ("breadTop".equals(type))
        {
            return new GreenfootImage("bread_top.png"); 
        }
        else if ("breadBottom".equals(type))
        {
            return new GreenfootImage("bread_bottom.png");
        }
        else if ("tomato".equals(type))
        {
            return new GreenfootImage("tomato.png");
        }
        else if ("cheese".equals(type))
        {
            return new GreenfootImage("cheese.png");
        }
        else if ("lettuce".equals(type))
        {
            return new GreenfootImage("lettuce.png");
        }
        else if ("patty".equals(type))
        {
            return new GreenfootImage("patty.png");
        }
        else
        {
            // fallback
            return new GreenfootImage("default_burger_item.png");
        }
    }
}
