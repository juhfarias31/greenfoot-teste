import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personag extends Actor
{
     public int speed = 1;
    /**
     * Act - do whatever the personag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        movimento();// Add your action code here.
    }
        public void movimento(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
    }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
    }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
    }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("f")){
            getWorld().addObject(new newPoder(), getX()-10 , getY()-100 );
    }
    }
    }