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
<<<<<<< Updated upstream
        image.scale(130, 130);
        speed = Greenfoot.getRandomNumber(3) + 2;
=======
        image.scale(100, 100);
        speed = 8;
>>>>>>> Stashed changes
    }
    public void act()
    {
        moving();
<<<<<<< Updated upstream
    }
        

=======
        
    }
>>>>>>> Stashed changes
    public void moving() {
        BurgerWorld world = (BurgerWorld)getWorld();
        int plateX = ((BurgerWorld)getWorld()).getPlateX();

        // If it lands on the plate
        if(getY() > 340 && getY() < 350 && getX() <= plateX + 70 && getX() >= plateX - 70){
<<<<<<< Updated upstream
            speed = 0;
            world.setBottomHasLanded(true);

            if(Greenfoot.isKeyDown("right")){
=======
            
            speed = 0;

            // Let the world know the bottom has landed
            world.setBottomHasLanded(true);

            // Now handle moving left/right if keys are pressed...
            if(Greenfoot.isKeyDown("right")){

>>>>>>> Stashed changes
                move(5);
            }
            if(Greenfoot.isKeyDown("left")){
                
                move(-5);
            }
        }
    }
}
