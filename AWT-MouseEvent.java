import java.awt.*; 
import java.awt.event.MouseListener; 
import java.awt.event.MouseEvent; 
class ExitExp extends Exception{ 
  ExitExp(){ 
    System.out.println("Exception Triggered"); 
  } 
} 
class AWT-MouseEvent implements MouseListener { 
  Frame f; Label l; 
  AWT-MouseEvent() { 
    f=new Frame(); 
    f.setSize(500,500); 
    f.addMouseListener(this); 
    f.setVisible(true); 
  } 
  void Exp()throws ExitExp{
    throw new ExitExp();
  } 
  public void mouseClicked(MouseEvent e) { 
    System.out.println("Mouse Clicked"); 
  } 
  public void mouseExited(MouseEvent e) { 
    System.out.println("Mouse Exited"); 
    try{Exp();} catch(ExitExp m){} 
  } 
  public void mousePressed(MouseEvent e) { 
    System.out.println("Mouse Pressed"); 
  } 
  public void mouseReleased(MouseEvent e) { 
    System.out.println("Mouse Released");
    } 
  public void mouseEntered(MouseEvent e) { 
    System.out.println("Mouse Entered"); 
  } 
  public static void main(String args[]) { 
    AWT-MouseEvent m=new AWT-MouseEvent(); 
  } 
}
