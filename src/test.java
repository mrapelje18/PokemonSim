import processing.core.PApplet;

public class test extends PApplet{

	public static void main(String[] args) {
		PApplet.main("test");

	}

	public void settings() {
		size(1000,1000);
	}
	public void setup() {
		fill(40,50,240);
	}
	
	public void draw() {
		ellipse(width/2,height/2,500,500);
	}
}
