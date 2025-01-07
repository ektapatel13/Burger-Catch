import greenfoot.*;


public class BurgerItem extends Actor
{
    private String itemType;   
    private int fallSpeed;    

    
    public BurgerItem(String itemType)
    {
        this.itemType = itemType;
        fallSpeed = Greenfoot.getRandomNumber(4) + 1; 

        setItemImage();
    }

    
    public void act()
    {
        fallDown();
        //checkIfMissed();
    }

    
    public String getItemType()
    {
        return itemType;
    }

    
    private void setItemImage()
    {
        GreenfootImage img;
        if ("breadTop".equals(itemType))
        {
            img = new GreenfootImage("bread_top.png");
        }
        else if ("breadBottom".equals(itemType))
        {
            img = new GreenfootImage("bread_bottom.png");
        }
        else if ("tomato".equals(itemType))
        {
            img = new GreenfootImage("tomato.png");
        }
        else if ("cheese".equals(itemType))
        {
            img = new GreenfootImage("cheese.png");
        }
        else if ("lettuce".equals(itemType))
        {
            img = new GreenfootImage("lettuce.png");
        }
        else if ("patty".equals(itemType))
        {
            img = new GreenfootImage("patty.png");
        }
        else
        {
            img = new GreenfootImage("default_burger_item.png");
        }

        
        int newWidth = img.getWidth() / 2;
        int newHeight = img.getHeight() / 2;
        img.scale(newWidth, newHeight);

        setImage(img);
    }

    
    private void fallDown()
    {
        setLocation(getX(), getY() + fallSpeed);
    }

    
    
}
