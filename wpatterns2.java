import javax.swing.*;
class wpattern2
{
public static void main(String arg[])
{
int i,j;
i=1;
System.out.print("\n");
	while(i<=5)
	{
	j=1;
	while(j<=5)
	{
	System.out.print(j+" ");
	j++;
	}
	System.out.print("\n");
	i++;
	}
System.out.print("\n");
i=1;
	while(i<=5)
	{
	j=1;
	while(j<=i)
	{
	System.out.print(j+" ");
	j++;
	}
	System.out.print("\n");
	i++;
	}
System.out.print("\n");
i=5;
	while(i>0)
	{
	j=5;
	while(j>5-i)
	{
	System.out.print(j+" ");
	j--;
	}
	System.out.print("\n");
	i--;
	}
}
}