package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	static int x = 300;
	static int y = 370;
	CarThing car1;
	CarThing car2;
	CarThing car3;
	CarThing car4;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		car1 = new CarThing(0, 100);
		car2 = new CarThing(0, 10);
		car3 = new CarThing(515, 275);
		car4 = new CarThing(515, 340);

	}

	@Override
	public void draw() {
		background(255, 150, 40);
		fill(10, 250, 122);
		ellipse(x, y, 40, 40);

		car1.draw();
		car2.draw();
		car3.draw();
		car4.draw();
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP)

			{
				y -= 25;
				// Frog Y position goes up
			} else if (keyCode == DOWN)

			{
				y += 25;

				// Frog Y position goes down
			} else if (keyCode == RIGHT) {
				x += 10;
				// Frog X position goes right
			} else if (keyCode == LEFT) {
				x -= 10;
				// Frog X position goes left
			}
		}
		if (x <= 20) {
			x = 20;
		}
		if (x >= 580) {
			x = 580;
		}
		if (y <= 20) {
			y = 20;
		}
		if (y >= 380) {
			y = 380;
		}

	}

	public void parameter() {

	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());

	}

	class CarThing {

		int carSpeed = 1;
		int x;
		int y;

		public CarThing(int x, int y) {
			this.x = x;
			this.y = y;

		}

		public void draw() {
			fill(218, 45, 227);
			rect(x, y, 80, 40);
			moveRight();

		}

		void moveRight() {
			if (x < 515) {
				for (int i = 0; i < 15; i++) {
					x += carSpeed;
					if (x == 515) {
						x = 0;
						moveRight();
					}
				}
			}

		}

		void moveLeft() {
			if (x > 0) {
				for (int i = 0; i < 15; i++) {
					x -= carSpeed;
					if (x == 515) {
						x = 0;
						moveLeft();
					}
				}
			}
		}
		/*
		 * void moveRätt() { if(x>0) { for(int i=0;i<15;i++) { x-=8; } } }
		 */
		// public void draw1() {
//        	fill(218, 45, 227);
//        	rect(0,100,80,40);
//        }public void draw2() {
//        	fill(218, 45, 227);
//        	rect(515,190,80,40);
//        }public void draw3() {
//        	fill(218, 45, 227);
//        	rect(0,275,80,40);
//        }public void draw4() {
//        	fill(218, 45, 227);
//        	rect(515,350,80,40);
//        }

	}

}
