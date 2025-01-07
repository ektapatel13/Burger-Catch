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
        addObject(plate, 100, 100);
        plate.scale(plate.getWidth()*10/100, plate.getHeight()*10/100);
    }
}
