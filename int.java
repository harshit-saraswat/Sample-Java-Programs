import javax.swing.*;
class posneg
{
public static void main(String arg[])
{
	int a;
	a=Integer.parseInt(JOptionPane.showInputDialog("Enter any no.!"));
	if(a>0)
	{
	System.out.println(a+" is a positive number.");
	}
	else
	{
	System.out.println(a+" is a negative number.");
	}
}
}
