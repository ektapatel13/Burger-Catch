
import greenfoot.*;  

public class BurgerWorld extends World
{
    private int count = 0;
    public int foodCount = 0;
    Plate plate1 = new Plate(); 
    public BurgerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(plate1, 300, 340);

    }
    public int getPlateX(){
        return plate1.getX();
    }
    public void act(){
        if (Greenfoot.getRandomNumber(100) < 1) {
            spawnIngredient();
        }
        
        if(count == 0){
            addObject(new Cheese(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
        if(Greenfoot.getRandomNumber(100)>98){
            addObject(new Patty(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
        if(Greenfoot.getRandomNumber(100)>98){
            addObject(new Lettuce(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
        if(Greenfoot.getRandomNumber(100)>98){
            addObject(new Tomato(), Greenfoot.getRandomNumber(getWidth()), 0);
        
        }
        count++;
    }
    
    public void spawnIngredient() {
        int pick = Greenfoot.getRandomNumber(4);
        Actor ingredient;
        if (pick == 0) {
            ingredient = new Tomato();
        } else if (pick == 1) {
            ingredient = new Cheese();
        } else if (pick == 2) {
            ingredient = new Patty();
        } else {
            ingredient = new Lettuce();
        }
        
        addObject(ingredient, Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
