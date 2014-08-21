int fore = 20;
int splay = 50;
void setup()
{
  size(300, 300);
  background(255);
  stroke(0);
  strokeWeight(5);
  noLoop();
}
void draw()
{
  head();
  body();
}
void head()
{
  fill(255,255,0);
  ellipse(150,75, 76, 76);
  point(150 - fore, 65);
  point(150 + fore, 65);
  strokeWeight(1);
  fill(0);
  arc(150, 75, 50, 50,0, PI);
}
void body()
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

