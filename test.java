float goldx,goldy;
ffloat goldX,goldY;
float lestatX,lestatY;
float hermanX,hermanY;
float horizon;

float DX,DY;
float x,y,w,h;
float score;
float top,bottom,right, left;




void setup(){
  size(700,580);
  horizon= height/4;
  x=150;
  y=75; 


 // X=width/2;
 //Y=width/2;
  DX=3;
  DY=2;
  
  
}
void reset(){
x= 150;
y= 75;
DX= 50;
DY= 50;
x=random(0,500);
y=random(250.500);
DX=random(-1,+1);
DY=random(-1,+1);
score=50;
top=0;
bottom=500;
right=500;
left=0;
}
void draw(){
    background(50,160,80);
    fill(255,255,0);   
    
 ellipse(x,y,50,50);
 
  rect(100,200,150,110);
 //triangle(290,200,horizon,90,90,horizon -30);
}
rect(dx,dy,20,90);
ellipse(dx+16,dy-9,32,32);

}
