package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int x=300;
    static int y=370;
    
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(255,150,40);
    	fill(10, 250, 122);
    	ellipse(x, y, 40, 40);
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            	
            {
                y-=10;
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            	
            {
            	y+=10;

            	//Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	x+=10;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                x-=10;
            	//Frog X position goes left
            }
        }
    }
    public void parameter() {
    	
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
