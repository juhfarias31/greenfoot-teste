import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("SimpsonSong.mp3");
   
    public void started()
    {
    bgMusic.playLoop();
    }
    public void stopped()
    {
    bgMusic.pause();
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 300, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        personagem personagem = new personagem();
        addObject(personagem,356,168);
        personag personag = new personag();
        addObject(personag,81,157);
        gif gif = new gif();
        addObject(gif,262,199);
        gif.setLocation(261,237);
        gif.setLocation(258,213);
        gif.setLocation(266,232);
        gif.setLocation(283,195);
        gif.setLocation(296,209);
        personagem.setLocation(406,221);
        gif.setLocation(300,216);
        personagem.setLocation(395,191);
        personagem.setLocation(392,185);
        gif.setLocation(298,220);
        personagem.setLocation(383,230);
        personagem.setLocation(384,127);
        gif.setLocation(309,174);
        personagem.setLocation(419,260);
        gif.setLocation(318,238);
        gif.setLocation(229,200);
        personagem.setLocation(396,163);
        gif.setLocation(221,219);
        personag.setLocation(84,149);
        personagem.setLocation(399,181);
        personag.setLocation(88,164);
        newPoder newPoder = new newPoder();
        addObject(newPoder,88,164);
        personag.setLocation(409,178);
        removeObject(newPoder);
        personagem.setLocation(79,192);
        gif.setLocation(219,236);
        personagem.setLocation(405,226);
        personagem.setLocation(70,216);
        personagem.setLocation(381,195);
        gif.setLocation(225,205);
        personagem.setLocation(69,168);
        personagem.setLocation(386,212);
        gif.setLocation(263,219);
        personag.setLocation(79,177);
        personag.setLocation(70,150);
        gif.setLocation(245,218);
        personagem.setLocation(378,180);
        Counter counter = new Counter();
        addObject(counter,440,29);
        Counter counter2 = new Counter();
        addObject(counter2,150,26);
        counter2.setLocation(161,34);
        gif.setLocation(227,230);
        personagem.setLocation(372,228);
        personag.setLocation(114,185);
        counter.setLocation(304,19);
        counter2.setLocation(212,19);
        counter.setLocation(316,42);
        gif.setLocation(444,248);
        gif.setLocation(448,235);
        personag.setLocation(84,199);
        gif.setLocation(452,220);
        personagem.setLocation(412,241);
        personagem.setLocation(343,211);
        counter2.setLocation(115,36);
        counter.setLocation(320,35);
        counter2.setLocation(183,28);
    }
}
