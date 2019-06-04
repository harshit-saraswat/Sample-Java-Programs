import javax.swing.*;
class abc123
{
public static void main(String arg[])
{
int a[][]=new int[3][3],b[][]=new int[3][3],c[][]=new int[3][3];
int i,j;
System.out.println("Enter Ist Matrix");
	for(i=0;i<3;i++)
	for(j=0;j<3;j++)
	a[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter element "+i+j));
System.out.println("Enter IInd Matrix");
	for(i=0;i<3;i++)
	for(j=0;j<3;j++)
	b[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter element "+i+j));
System.out.println("Matrix I:\n");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(a[i][j]+"\t");
	}
	System.out.print("\n");
	}
System.out.println("Matrix II:\n");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(b[i][j]+"\t");
	}
	System.out.print("\n");
	}
System.out.println("Sum of matrices is:\n");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+"\t");
	}
	System.out.print("\n");
	}
}
}