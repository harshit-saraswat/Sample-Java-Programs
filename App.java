import java.awt.*;
import java.applet.*;
public class App extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.black);
setForeground(Color.green);
g.drawString("Hello!",10,20);
g.drawLine(30,50,70,90);
g.drawOval(100,60,250,100);
g.drawRect(10,20,30,40);
g.fillOval(100,60,250,100);
g.fillRect(10,20,30,40);
}
}