import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avocado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avocado extends IngredientBase
{
    /**
     * Act - do whatever the Avocado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Avocado(){
        GreenfootImage image = getImage();
        image.scale(160, 130);
    }
}
