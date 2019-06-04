import java.awt.*;
import java.applet.*;

public class App extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(20,20,30,40);
		g.drawRect(20,20,30,40);
	}
}