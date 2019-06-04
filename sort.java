import javax.swing.*;
class sorting
{
public static void main(String arg[])
{
int a[]=new int[10];
int temp,i,j;
	for(i=0;i<10;i++)
	a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter a no."+i));
System.out.println("The Entered Array is:\n");
	for(i=0;i<10;i++)
	System.out.print(a[i]+"\t");
	for(i=0;i<10;i++)
	{
	for(j=0;j<10-i-1;j++)
	{
	if(a[j]>a[j+1])
	{
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
	}
	}
System.out.println("\nThe Sorted Array is:\n");
	for(i=0;i<10;i++)
	System.out.print(a[i]+"\t");
}
}