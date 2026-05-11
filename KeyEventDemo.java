import java.awt.*; 
import java.applet.*;  
import java.awt.event.*;  

public class KeyEventDemo extends Applet implements KeyListener { 
String msg = ""; 
public void init() {  
addKeyListener(this);  
}  
// Key Released  
public void keyReleased(KeyEvent k) { 
showStatus("KeyReleased"); 
repaint();  
}  
// Key Typed  
public void keyTyped(KeyEvent k){ 
showStatus("Key Typed");  
repaint();  
}  
// Key Pressed 
public void keyPressed(KeyEvent k){  
showStatus("KeyPressed"); 
repaint();  
}  
public void paint(Graphics g) {  
g.drawString(msg, 10, 10); 
}
}