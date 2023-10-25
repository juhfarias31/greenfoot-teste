import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogo extends Enter
{
    public Dialogo();
    {
    }
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        prepare();
    }
    
    public void act(){
      if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("Dialogo.png"));
    }
    /**
     * Constructor for objects of class Dialogo.
     * 
     */
}
}