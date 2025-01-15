import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacon extends IngredientBase
{
    /**
     * Act - do whatever the Bacon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bacon(){
        GreenfootImage image = getImage();
        image.scale(160, 130);
    }
   
}
