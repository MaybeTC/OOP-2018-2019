package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

<<<<<<< HEAD
	public void Face()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Face());
	}
	
	public void Array()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Array());
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.Array();			
=======
	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
	
	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.starMap();			
>>>>>>> d85640236ecd5b7cc0c4b1632cfc8cc97e76eb0c
	}
}