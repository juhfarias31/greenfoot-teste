import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends World
{

    /**
     * Constructor for objects of class Enter.
     * 
     */
    public Enter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        prepare();
    }

    public void act(){
        if (Greenfoot.isKeyDown("enter")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}