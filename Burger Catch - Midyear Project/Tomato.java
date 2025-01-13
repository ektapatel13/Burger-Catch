
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tomato extends IngredientBase
{
    //private int speed = 2;
    //private boolean didScore = false;
    
    /**
     * Act - do whatever the Cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public Tomato(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        //speed = Greenfoot.getRandomNumber(3) + 2;
    }
    //public void act()
    //{
        //moving();
        //isTouchingEdge();
        
    //}
    
    //public void moving(){
      //  BurgerWorld world = (BurgerWorld) getWorld();
      //  int plateX = world.getPlateX();
      //  setLocation(getX(), getY() + speed);
      //  if(getY() >= ((BurgerWorld)getWorld()).getStackHeight() && getX() <= plateX + 70 && getX() >= plateX - 70) {
          //  speed = 0;
          //  ((BurgerWorld)getWorld()).updateStackHeight(getY() - 20);
          //  if(didScore==false &&  (isTouching(Plate.class) || isTouching(Patty.class) || isTouching(Lettuce.class) || isTouching(Tomato.class) || isTouching(Cheese.class) || isTouching(BurgerBottom.class))) {
           //     ((BurgerWorld)getWorld()).addScore(1);
             //   didScore = true;
          //  }
          //  if(Greenfoot.isKeyDown("right")) {
           //     move(8);
           // }
       //     if(Greenfoot.isKeyDown("left")) {
        //        move(-8);
        //    }
      //  }

   // }
    //public void isTouchingEdge() {
       // if (getY() > 390) {
          //  ((BurgerWorld)getWorld()).addScore(-1);
          //  getWorld().removeObject(this);
          //  return; 
      //  }
        
    
        
   // }
}