package ie.tudublin;

import example.CubeVisual1;
import example.MyVisual;
import example.CubeVisual;
import example.WaveForm;
import c18470774.Scene;


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Scene());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}