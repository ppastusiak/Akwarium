import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ryba extends Actor
{
    
    public void act() 
    {
      // move(4);
       if(isAtEdge()){
        setRotation(180-getRotation());
        getImage().mirrorVertically();
        }
    }    
}
