package c18470774;

import ie.tudublin.Visual;
import ddf.minim.*;
import ddf.minim.analysis.*;


public class Stars extends Square
{	

	Minim minim;
	AudioSample ai;
	FFT fft;
	int numSamples = 100;
	float[] lerpedSamples = new float[numSamples];

	public void settings()
	{
		//fullScreen();
		size(1024, 1024);
	}

	public void setup() 
	{
		minim = new Minim(this);
		ai = minim.loadSample("goosebumps.mp3");
		
		fft = new FFT(1024, 1024);

		cx = width / 2;
		cy = height / 2;
		
	}
	public void keyPressed()
	{
		ai.stop();
		ai.trigger();
	}

	

	float cx, cy;
	float offs = 0;
	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		fft.window(FFT.HAMMING);
		fft.forward(ai.left);
		strokeWeight(3);
		float radius = cx;
		float theta = TWO_PI / (float) numSamples;
		float cgap = 255 / numSamples + 1;
		float average = 0;
		for(int i = 0 ; i < numSamples ; i ++)
		{
			float c = ((i + offs) * cgap) % 255; 
			stroke(c, 255, 255);
			lerpedSamples[i] = lerp(lerpedSamples[i], fft.getBand(i)/300, 0.2f);
			float x = cx + (sin(i * theta) * radius * lerpedSamples[i]);
			float y = cy + (cos(i * theta) * radius * lerpedSamples[i]);
			line(cx, cy, x, y);
			average += lerpedSamples[i];  
		}
		average /= (float) numSamples;
		offs = average * 2;
	}
}