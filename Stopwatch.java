import java.applet.*;
import java.awt.*;
public class Stopwatch extends Applet implements Runnable
{
Thread t;
int h,m,s;
public void init()
{
	t=new Thread(this);
	h=m=s=0;
}
public void start()
{
	t.start();
}
public void run()
{
try
{
	while(h<24)
	{
		repaint();
		t.sleep(1000);
		s++;
		if(s==60)
		{
			s=0;
			m++;
			if(m==60)
			{
			m=0;
			h++;
			}
		}
	}	
}
catch(Exception e){}
}
public void paint(Graphics g)
{
g.drawString("Hours:Minutes:Seconds",40,40);
g.drawString(Integer.toString(h),45,80);
g.drawString(Integer.toString(m),95,80);
g.drawString(Integer.toString(s),150,80);
}
}