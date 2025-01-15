
import greenfoot.*;  

public class BurgerWorld extends World
{
    protected Plate plate1 = new Plate();
    protected int count = 0;
    protected boolean bottomHasLanded = false;
    protected int score = 0;
    protected int counter = 0;
    protected int stackHeight = 340;
    protected int maxHeight = 380;
    protected boolean spawnIngredients = true; // Controls whether ingredients should spawn
    protected boolean burgerTopSpawned = false; // Ensures only one Burger Top spawns
    protected int maxScore = 10;
    public BurgerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(plate1, 300, 340);
        addObject(new BurgerBottom(), getWidth()/2, 0);
    }
    public void setBottomHasLanded(boolean value) {
        bottomHasLanded = value;
    }
    public int getPlateX(){
        return plate1.getX();
    }
    public int getStackHeight() {
        return stackHeight;
    }
    public void scoreBoard(int points) { // creates scoreboard
        score = score + points;
        
    }
    public int getScore() {
        return score;
    }
    public void increaseStackHeight(int increment) {
        stackHeight += increment;
        if (stackHeight >= maxHeight) {
            gameLost();
        }
    }
    
    public void updateStackHeight(int isNew) {
        stackHeight = isNew;
    }

    
    public void gameLost() {
            showText("Game over! You lose.", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
    }
    
    public void addScore(int points) {
        score += points; // adds points gained to the total score
        if (score < 0) { // incase score goes into negatives 
            score = 0;
        }
        showScoreBoard();
        
    }
    public void showScoreBoard() {
        showText("Score: " + score, 40, 390);
    }
    public void act(){
       if (Greenfoot.getRandomNumber(100) < 1) {
            spawnIngredient();
       }
       showScoreBoard();
       if (score == maxScore && !burgerTopSpawned) {
            spawnBurgerTop();
            burgerTopSpawned = true; // Ensure no more Burger Tops or ingredients spawn
            spawnIngredients = false; // Stop spawning other ingredients
        }
       
        count+=50;
    }
    
    private void spawnBurgerTop() {
        addObject(new BurgerTop(), getWidth() / 2, 0); // Spawn the Burger Top at the center top of the screen
    }

    public void levelCompleted() {
        showText("Level Completed! Click the Button to continue.", 300, 150);
        addObject(new NextLevel(), getWidth() / 2, getHeight() / 2 + 50);
        //clearIngredients();
    }
    //private void clearIngredients() {
        //removeObjects(getObjects(IngredientBase.class)); 
        //removeObjects(getObjects(BurgerBottom.class)); 
        //removeObjects(getObjects(MoldyBread.class)); 
        //removeObjects(getObjects(Onion.class)); 
    //}
    
    public void startNextLevel() {
        Greenfoot.setWorld(new BurgerWorldTwo());  
    }
    
    public void spawnIngredient() {
        int pick = Greenfoot.getRandomNumber(5);
        Actor ingredient;
        if (pick == 0) {
            ingredient = new Tomato();
        } else if (pick == 1) {
            ingredient = new Cheese();
        } else if (pick == 2) {
            ingredient = new Patty();
        } else if (pick == 3) {
            ingredient = new MoldyBread();
        } else {
            ingredient = new Lettuce();
        }
        
        if (score >= 10) {
            ingredient = new BurgerTop(); 
        }
        
        int onionpick = Greenfoot.getRandomNumber(15);
        if (onionpick == 2) {
            ingredient = new Onion();
        }
        
        addObject(ingredient, Greenfoot.getRandomNumber(getWidth()), 0);
        
}
}
