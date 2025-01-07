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
}
