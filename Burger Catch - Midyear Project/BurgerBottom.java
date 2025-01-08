import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurgerBottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerBottom extends Actor
{
    private int speed = 2;
    /**
     * Act - do whatever the BurgerBottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BurgerBottom() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        speed = Greenfoot.getRandomNumber(4) + 2;
    }
    public void act()
    {
        moving();
    }
    public void moving(){
        BurgerWorld world = (BurgerWorld)getWorld();
        int plateX = world.getPlateX();
        
        // If it lands on the plate
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
            if(speed != 0) {
                world.foodCount++;
                // Step 2: Once speed hits 0, let the world know we've landed
            }
            speed = 0;
            
            // Let the world know the bottom has landed
            world.setBottomHasLanded(true);
            
            // Now handle moving left/right if keys are pressed...
            if(Greenfoot.isKeyDown("right")){
                move(4);
            }
            if(Greenfoot.isKeyDown("left")){
                move(-4);
            }
        }
        
        // Keep falling until we land or remove if off-screen
        setLocation(getX(), getY()+speed);
        if(getY() > 390){
            world.removeObject(this); 
        }
    }
}
