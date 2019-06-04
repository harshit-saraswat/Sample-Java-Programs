import javax.swing.*;
class fact
{
public static void main(String arg[])
{
int i,n,x=1;
System.out.println("This program prints fact of a given no.");
n=Integer.parseInt(JOptionPane.showInputDialog("Enter any no."));
	for(i=n;i>0;i--)
	{
	x*=i;
	}
System.out.println("The Factorial of "+n+" is: "+x);
}
}