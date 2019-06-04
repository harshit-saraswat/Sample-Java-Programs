import javax.swing.*;
class abc21
{
public static void main(String arg[])
{
int a[][]=new int[3][3];
int i,j,sum=0;
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
	if(i==j||i+j==2)
	{
	sum+=a[i][j];
	}
	}
	System.out.print("\n");
	}
System.out.print("Sum of diagonal elements is: "+sum);
}
}