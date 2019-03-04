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
	}
}