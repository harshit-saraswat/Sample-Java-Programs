import javax.swing.*;
class abc12
{
public static void main(String arg[])
{
int a[][]=new int[3][3],b[][]=new int[3][3];
int i,j;
System.out.println("Enter a Matrix");
	for(i=0;i<3;i++)
	for(j=0;j<3;j++)
	a[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter element "+i+j));
System.out.println("Matrix entered is:\n");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(a[i][j]+"\t");
	}
	System.out.print("\n");
	}
System.out.println("Interchanged matrix is:\n");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	b[i][j]=a[j][i];
	System.out.print(b[i][j]+"\t");
	}
	System.out.print("\n");
	}
}
}