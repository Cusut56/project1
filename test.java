flfloat goldx,goldy;
float goldX,goldY;
float lestatX,lestatY;
float lestatDX,lestatDY;
float hermanX,hermanY;
float hermanDX,hermanDY;
float horizon;
float sunX,sunY;
float x,y,w,h;
float DX,DY;


void setup(){
  size(680,480);
  horizon=height/4;
  sunX=width*1/4;
   x=width/2;
 y=width/2;
  DX=3;
  DY=2;
  reset();
  
  
}
void reset(){
 lestatX=30;
hermanY=horizon-20;
lestatDX=3;
hermanDY=2;
}
void draw(){
    background(250,100,180);     
    
 ellipse(sunX,sunY,50,50); 
  rect(90,100,150,110);
 //triangle (280,100,horizon,90.90,horizon-30); 
ellipse(DX +250,DY +320,42,42);
rect(DX+240,DY+330,42,92);
fill(255,255,0);
}
