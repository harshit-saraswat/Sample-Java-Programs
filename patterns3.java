import javax.swing.*;
class pattern3
{
public static void main(String arg[])
{
int i,j;
System.out.print("Pattern 1:\n");
	for(i=1;i<=5;i++)
	{
	for(j=1;j<=i;j++)
	{
	System.out.print(j+" ");
	}
	System.out.print("\n");
	}
System.out.print("Pattern 2:\n");	
	for(i=5;i>=1;i--)
	{
	for(j=5;j>5-i;j--)
	{
	System.out.print(j+" ");
	}
	System.out.print("\n");
	}
}
}