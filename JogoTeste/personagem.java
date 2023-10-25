import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personagem extends Actor
{
    public int speed = 1;
    /**
     * Act - do whatever the personagem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
    movimento();// Add your action code here.
}
    public void movimento(){
        if (Greenfoot.isKeyDown("5")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if (Greenfoot.isKeyDown("2")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        else if (Greenfoot.isKeyDown("1")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("3")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("7")){
            getWorld().addObject(new poder(), getX() + 5, getY() + 0);
        }
}
}
