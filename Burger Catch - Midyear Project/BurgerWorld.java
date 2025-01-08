import greenfoot.*;  

public class BurgerWorld extends World
{
    
    public BurgerWorld()
    {    
        // Create a new world with 600x400 cells and 1x1 pixel each
        super(600, 400, 1);
        prepare();
    }
    
    public void prepare() {
        Platee plate = new Platee();
        addObject(plate, 300, 350);
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 0.85) {
            spawnIngredient();
        }
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
