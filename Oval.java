import java.applet.*;
import java.awt.*;
public class Oval extends Applet implements Runnable
{
Thread t;
int x;
public void init()
{
	t=new Thread(this);
	x=0;
}
public void start()
{
	t.start();
}
public void run()
{
try
{
	while(x<=800)
	{
		repaint();
		t.sleep(300);
		x+=10;
		if(x==800)
		{
			x=0;
		}
	}
}
catch(Exception e){}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawOval(x,100,50,30);
g.fillOval(x,100,50,30);
}
}