import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Whackamole extends Applet implements MouseListener, MouseMotionListener, Runnable
{ 

 Graphics bufferGraphics;
 Image offscreen; 

 int Hole1X, Hole1Y, Hole2X, Hole2Y, Hole3X, Hole3Y, Hole4X, Hole4Y, Hole5X, Hole5Y, Hole6X, Hole6Y, Hole7X, Hole7Y, Hole8X, Hole8Y, Hole9X, Hole9Y, score, moletime, appletHeight, appletWidth, MoleW, MoleH, mouseX, mouseY;

 Image Mole, Hammer;
 Boolean ShowMole;

 public void init()
 {
  setBackground(Color.green);
  appletHeight = 800;
     appletWidth = 1200;
     mouseX = 100;
     mouseY = 100;
  //hole placements
  Mole = this.getImage(this.getDocumentBase(), "d1c662b9b02f581.png");
  Hammer = this.getImage(this.getDocumentBase(), "download.jfif");
  addMouseListener(this );
  addMouseMotionListener(this);
 }

 public void mouseEntered( MouseEvent e ) { /* do nothing */}
    public void mouseExited( MouseEvent e )  { /* do nothing */}
  public void mouseClicked( MouseEvent e ) { /* do nothing */}
   public void mousePressed( MouseEvent e ) { /* do nothing */}
    public void mouseMoved( MouseEvent e )   { /* do nothing */}
    public void mouseDragged( MouseEvent e ) { /* do nothing */} 

 public void mouseReleased( MouseEvent e ) {
       mouseX = e.getX();
       mouseY = e.getY();
       repaint();
       e.consume(); }

 public void start() {
    // create a thread to do multi-tasking
    Thread myAnimation = new Thread (this);
    myAnimation.start();
  }


 public void paint(Graphics g){
  bufferGraphics.clearRect(0,0,appletWidth, appletHeight);
  g.setColor(Color.black);
  bufferGraphics.fillOval(Hole1X, Hole1Y, HoleW, HoleH);
  /*repeat this for the remaining holes*/
  bufferGraphics.drawImage("download.jfif", mouseX, mouseY,this); 
    g.drawImage(offscreen,0,0,this); }

  public void run(){
    while(true){
      repaint()
    }}
 public void update(Graphics g) 
  { 
    paint(g); 
 }}
