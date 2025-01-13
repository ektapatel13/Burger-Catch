
import greenfoot.*;  

public class BurgerWorld extends World
{
    private Plate plate1 = new Plate();
    private int count = 0;
    public int foodCount = 0;
    private boolean bottomHasLanded = false;
    private int score = 0;
    private int counter = 0;
    private int stackHeight = 340;
    private int maxHeight = 380;
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
        if (score >= 20) { 
            showText("Game Over! You Win!", getWidth() / 2, getHeight() / 2); // prints in the middle of the screen 
            Greenfoot.stop(); // stops program
        }
    }
    public void showScoreBoard() {
        showText("Score: " + score, 40, 390);
    }
    public void act(){
       if (Greenfoot.getRandomNumber(100) < 1) {
            spawnIngredient();
       }
       showScoreBoard();
       
        count+=50;
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
        
        if (score >= 20) {
            ingredient = new BurgerTop(); 
        }
        
        int onionpick = Greenfoot.getRandomNumber(15);
        if (onionpick == 2) {
            ingredient = new Onion();
        }
        
        addObject(ingredient, Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
