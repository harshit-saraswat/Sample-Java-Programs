import javax.swing.*;
class abc
{
	public static void main(String arg[])
	{int a,b,c;
	 a=Integer.parseInt(JOptionPane.showInputDialog("First no.?"));
	 b=Integer.parseInt(JOptionPane.showInputDialog("Second no.?"));
	 c=a+b;
	 System.out.println("sum of "+a+" and "+b+" is ="+c);
	}
}