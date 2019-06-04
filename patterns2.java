import javax.swing.*;
class pattern2
{
public static void main(String arg[])
{
int i,j;
System.out.print("Pattern 1:\n");
	for(i=0;i<=4;i++)
	{
	for(j=0;j<=i;j++)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
System.out.print("Pattern 2:\n");	
	for(i=4;i>=0;i--)
	{
	for(j=i;j>=0;j--)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
}
}