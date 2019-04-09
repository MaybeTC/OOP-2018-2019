package ie.dit;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	/*int xx = 2;
	float f = 0.0f; // 4 bytes
	char c = 'h'; // Unicode
	String s = "Hello";
	boolean b = (1 == 0);
	double d = 0; // 8 bytes*/

	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
		/*clear();
		fill(255);
		textSize(030);
	
		char[] myChars = {
		'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', 'n', ' ', 
		'a', 'r', 'r', 'a', 'y', ' ', 'o', 'f', ' '
		};
		text(myChars, 0, myChars.length, 20, 50);
		
		char[] fromStr = "CRAZY characters!".toCharArray();
		text(fromStr, 6, fromStr.length, 20, 90);*/
	}
}
