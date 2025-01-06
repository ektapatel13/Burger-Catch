import greenfoot.*;

/**
 * BurgerItem represents a piece of the burger (bread, tomato, cheese, etc.)
 * It falls from the top of the screen to the bottom.
 */
public class BurgerItem extends Actor
{
    private String itemType;   // "tomato", "cheese", "lettuce", etc.
    private int fallSpeed;     // How quickly the item falls

    /**
     * Constructor that takes a string indicating the item type.
     */
    public BurgerItem(String itemType)
    {
        this.itemType = itemType;
        // Random fall speed from 1 to 4 (feel free to adjust range)
        fallSpeed = Greenfoot.getRandomNumber(4) + 1; 

        setItemImage();
    }

    /**
     * Called every frame (about 60 times per second). Moves item down,
     * checks if it reached bottom.
     */
    public void act()
    {
        fallDown();
        checkIfMissed();
    }

    /**
     * Return the itemType for the Plate to know which ingredient was caught.
     */
    public String getItemType()
    {
        return itemType;
    }

    /**
     * Set the image according to itemType, possibly scaling it if desired.
     */
    private void setItemImage()
    {
        GreenfootImage img;
        if ("breadTop".equals(itemType))
        {
            img = new GreenfootImage("bread_top.png");
        }
        else if ("breadBottom".equals(itemType))
        {
            img = new GreenfootImage("bread_bottom.png");
        }
        else if ("tomato".equals(itemType))
        {
            img = new GreenfootImage("tomato.png");
        }
        else if ("cheese".equals(itemType))
        {
            img = new GreenfootImage("cheese.png");
        }
        else if ("lettuce".equals(itemType))
        {
            img = new GreenfootImage("lettuce.png");
        }
        else if ("patty".equals(itemType))
        {
            img = new GreenfootImage("patty.png");
        }
        else
        {
            // A default image, in case itemType doesn't match anything
            img = new GreenfootImage("default_burger_item.png");
        }

        // EXAMPLE: Scale the falling image to half size, if you like
        // int newWidth = img.getWidth() / 2;
        // int newHeight = img.getHeight() / 2;
        // img.scale(newWidth, newHeight);

        setImage(img);
    }

    /**
     * Move the item down by fallSpeed.
     */
    private void fallDown()
    {
        setLocation(getX(), getY() + fallSpeed);
    }

    /**
     * If the item reaches the bottom of the world, it's missed.
     * Decrement score and remove it.
     */
    private void checkIfMissed()
    {
        World world = getWorld();
        if (getY() >= world.getHeight() - 1)
        {
            ((BurgerWorld)world).decrementScore();
            world.removeObject(this);
        }
    }
}
