import javax.swing.*;
class xyz
{
public static void main(String arg[])
{
	int a,b;
	a=Integer.parseInt(JOptionPane.showInputDialog("Enter first no."));
	b=Integer.parseInt(JOptionPane.showInputDialog("Enter second no."));
	if(a>b)
	{
	System.out.println(a+" is greater than "+b);
	}
	else
	{
	System.out.println(b+" is greater than "+a);
	}
}
}