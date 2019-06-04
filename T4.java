import java.applet.*;
import java.awt.*;
public class T4 extends Applet implements Runnable
{
Thread t;
int n;
public void init()
{
t=new Thread(this);
n=1;
}
public void start()
{
t.start();
}
public void run()
{
try
{
while(n<=10)
{
repaint();
t.sleep(1000);
n++;
}
}
catch(Exception e){}
}
public void paint(Graphics g)
{
g.drawString(Integer.toString(n),30,50);
}
}