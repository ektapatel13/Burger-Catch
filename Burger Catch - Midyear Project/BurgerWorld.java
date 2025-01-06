import greenfoot.*;  
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * The main world where the burger items fall and the plate catches them.
 */
public class BurgerWorld extends World
{
    private int score = 0;            // The player's score
    private int itemsSpawned = 0;     // Number of burger items spawned
    private List<String> burgerOrder; // The order in which items will fall

    // Time between spawns (in act steps); adjust this for difficulty
    private int spawnDelay = 60; 
    private int delayCounter = 0;

    /**
     * Constructor for objects of class BurgerWorld.
     */
    public BurgerWorld()
    {    
        // Create a new world with 600x400 cells and 1x1 pixel each
        super(600, 400, 1);
        
        // Prepare the game
        prepare();
    }

    /**
     * Set up the world, plate, and build the burger order (top bread, random fillings, bottom bread).
     */
    private void prepare()
    {
        // 1. Add the Plate at the bottom center
        Platee plate = new Platee();
        addObject(plate, getWidth() / 2, getHeight() - 30);

        // 2. Create a list of random fillings
        List<String> fillings = Arrays.asList("tomato", "cheese", "lettuce", "patty");
        Collections.shuffle(fillings);

        // 3. Build the burger order: top bread -> shuffled fillings -> bottom bread
        burgerOrder = new ArrayList<String>();
        burgerOrder.add("breadTop");
        burgerOrder.addAll(fillings);
        burgerOrder.add("breadBottom");

        // Show the initial score
        showText("Score: " + score, 60, 20);
    }

    /**
     * This act method runs every frame (about 60 times per second by default).
     * We'll handle spawning items here.
     */
    public void act()
    {
        // If there are still items to spawn...
        if (itemsSpawned < burgerOrder.size())
        {
            delayCounter++;
            // Spawn one item every 'spawnDelay' acts (e.g. every 60 frames)
            if (delayCounter >= spawnDelay)
            {
                spawnItem(burgerOrder.get(itemsSpawned));
                itemsSpawned++;
                delayCounter = 0;
            }
        }
    }

    /**
     * Spawns a BurgerItem of the given type at a random x position at the top of the screen.
     */
    public void spawnItem(String itemType)
    {
        BurgerItem item = new BurgerItem(itemType);
        int randomX = Greenfoot.getRandomNumber(getWidth());
        addObject(item, randomX, 0);
    }

    /**
     * Increase the score by 1 and update display.
     */
    public void incrementScore()
    {
        score++;
        showText("Score: " + score, 60, 20);
    }

    /**
     * Decrease the score by 1 and update display.
     */
    public void decrementScore()
    {
        score--;
        showText("Score: " + score, 60, 20);
    }
}
