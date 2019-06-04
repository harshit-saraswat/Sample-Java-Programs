import javax.swing.*;
class rt
{
public static void main(String arg[])
{
int i,j,s,e;
System.out.println("This program prints tables");
s=Integer.parseInt(JOptionPane.showInputDialog("Enter a starting point for tables."));
e=Integer.parseInt(JOptionPane.showInputDialog("Enter an ending point for tables."));
	for(i=s;i<=e;i++)
	{
	for(j=1;j<=10;j++)
	{
	System.out.print(i*j+" ");
	}
	System.out.print("\n");
	}
}
}