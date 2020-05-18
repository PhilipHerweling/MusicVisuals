# Music Visualiser Project

Name:

Student Number: 

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Link to youtube video of my project
https://www.youtube.com/watch?v=xiLT-I-rU_w

# Description of the assignment
For this assignment i made out a plan before i started and wanted to make three distinct scenes. I mean by this 
that i wanted three render methods in differnt classes which were called one after the other. The first scene/ render method is 
in the Cube class and this has cubes moving, rotating,expading and shrinking depending on the ampiltude and changing colour. I 
i have multiple cubes which all come together at the end and when they do the next render method is called, which is totally differnt 
to the cube and its in the cilinder class. in this render method i have a sphere and ellipses which rotate around the sphere. When the ampiltude hits differnt levels the ellipses stop rotating and more are added the higher 
the ampiltude gets. after a certain amount of time the render method in the the spiral class is called and this then displays a spiral 
which changes colours to the music.

# Instructions
1. (Works with any sny but the song saved as gbBaseBoost.mp3 works best, this song will already be set to play when you downloaded or forked the repo)
2. Make sure that main calls the class Scene(Main should already be calling Scene)
3. run the main method
4. press space bar and then everything will commence and you dont have to do anything else
5. press link to veiw youtube video https://www.youtube.com/watch?v=xiLT-I-rU_w

# How it works
I have 5 classes. The Scene class is where the settings, setup and draw method is and is where i call the render methods from 
the Cube class, Cilinder class and Spiral class. The Cube, Cilinder and Spiral classes are child classes to the Shapes class.
The shape class has a few variables and one method called calculate. In this method the sizes for all the shapes are calculated.
In the render methods for all of the child classes for shape i just call the calculate method. The sizes constantly change with the ampiltude that why 
I call calculate in the render class. I have very in depth comments in my code for everything i did. These will explain in further detail 
how i got everything working.

# What I am most proud of in the assignment
I am most proud of the spiral that I was able to make because it was quite difficult to wrap my head around 
what a spiral actually is and how to get one to go around perfectly using sin and cos. It took the longest to do 
but im very happy how it turned out. Im also proud of how much i have learned doing this assignment, before starting 
I thought i knew how alot of functions worked but when doing the assignment I realised how little I actually did know about 
proccesing. This assignment has definitley inspired me to learn more about proccessing.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

