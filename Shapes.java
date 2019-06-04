import java.applet.*;
import java.awt.*;
public class Shapes extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.drawOval(200,200,400,400);
g.fillOval(200,200,400,400);
g.setColor(Color.black);
g.drawOval(300,300,40,40);
g.drawOval(450,300,40,40);
g.fillOval(300,300,40,40);
g.fillOval(450,300,40,40);
g.setColor(Color.red);
g.drawOval(350,470,100,50);
g.fillOval(350,470,100,50);
}
}