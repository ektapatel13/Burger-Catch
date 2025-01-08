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
        if(count == 0){
            addObject(new BurgerBottom(), Greenfoot.getRandomNumber(900)-100, 60);
        }
        if(Greenfoot.getRandomNumber(100)>98.5){
            addObject(new Cheese(), Greenfoot.getRandomNumber(900)-100, 60);
        }
        if(Greenfoot.getRandomNumber(100)>98){
            addObject(new Patty(), Greenfoot.getRandomNumber(900)-80, 100);
        }
        if(Greenfoot.getRandomNumber(100)>98.3){
            addObject(new Lettuce(), Greenfoot.getRandomNumber(900)-80, 100);
        }
        if(Greenfoot.getRandomNumber(100)>98.89){
            addObject(new Tomato(), Greenfoot.getRandomNumber(900)-100, 100);
        
        }
        count++;
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
