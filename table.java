import javax.swing.*;
class tables
{
public static void main(String arg[])
{
int i,n,x;
System.out.println("This program prints table of a given no.");
n=Integer.parseInt(JOptionPane.showInputDialog("Enter any no."));
	for(i=1;i<=10;i++)
	{
	x=n*i;
	System.out.println(n+"X"+i+"="+x);
	}
}
}