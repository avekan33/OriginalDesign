import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int fore = 20;
int splay = 50;
public void setup()
{
  size(300, 300);
  background(255);
  stroke(0);
  strokeWeight(5);
  noLoop();
}
public void draw()
{
  head();
  body();
  greet();
}
public void head()
{
  fill(255,255,0);
  ellipse(150,75, 76, 76);
  point(150 - fore, 65);
  point(150 + fore, 65);
  strokeWeight(1);
  fill(0);
  arc(150, 75, 50, 50,0, PI);
}
public void body()
{
  strokeWeight(5);
  // Spine
  line(150,113, 150, 213); 
  // Legs
  line(150,213, 150+splay, 213 + splay);
  line(150,213, 150 - splay, 213 + splay);
  // Arms
  line(150, 153, 150 + splay, 153 - splay);
  line(150, 153, 150 - splay, 153 - splay);
}
public void greet()
{
	textAlign(CENTER);
	textSize(20);
	text("Hey!",150,20);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
