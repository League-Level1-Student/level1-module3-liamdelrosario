package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	static int x = 300;
	static int y = 370;
	CarThing car1;
	CarThing car2;
	Carthing1 car3;
	Carthing1 car4;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		car1 = new CarThing(0, 100);
		car2 = new CarThing(0, 290);
		car3 = new Carthing1(515, 10);
		car4 = new Carthing1(515, 200);

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

		if (intersects(car1) == true) {
			System.out.println("car3 intersects");
			x = 300;
			y = 370;
		}
		if (intersects(car2) == true) {
			System.out.println("car3 intersects");
			x = 300;
			y = 370;
		}
		if (intersects(car3) == true) {
			System.out.println("car3 intersects");
			x = 300;
			y = 370;
		}
		if (intersects(car4) == true) {
			System.out.println("car4 intersects");
			x = 300;
			y = 370;
		}
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

	boolean intersects(Carthing1 car) {
		if ((y > car.getY() && y < car.getY() + 50) && (x > car.getX() && x < car.getX() + car.getWidth())) {
			return true;
		} else {
			return false;
		}
	}
	boolean intersects(CarThing car) {
		if ((y > car.getY() && y < car.getY() + 50) && (x > car.getX() && x < car.getX() + car.getWidth())) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());

	}

	class Carthing1 {

		int x1;
		int y1;
		int carSpeed = 5;
		int width = 80;

		public Carthing1(int x1, int y1) {
			this.x1 = x1;
			this.y1 = y1;
		}

		public void draw() {
			// TODO Auto-generated method stub
			fill(218, 45, 227);
			rect(x1, y1, 80, 40);
			moveLeft();
		}

		void moveLeft() {

			x1 -= carSpeed;
			if (x1 < -width) {
				x1 = 600;

			}
		}

		private int getWidth() {
			return width;
		}

		private int getX() {
			return x1;
		}

		private int getY() {
			return y1;
		}

	}

	class CarThing {

		int x3;
		int y3;
		int carSpeed = 5;
		int width = 80;

		public CarThing(int x3, int y3) {
			this.x3 = x3;
			this.y3 = y3;
		}

		public void draw() {
			fill(218, 45, 227);
			rect(x3, y3, 80, 40);

			moveRight();

		}

		private int getWidth() {
			return width;
		}

		private int getX() {
			return x3;
		}

		private int getY() {
			return y3;
		}

		void moveRight() {

			x3 += carSpeed;
			if (x3 > 600) {
				x3 = -width;

			}

		}

	}

}
