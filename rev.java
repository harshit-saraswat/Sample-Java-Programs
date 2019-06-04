import javax.swing.*;
class Demo
{
public static void main(String arg[])
{
int l;
String name=JOptionPane.showInputDialog("Enter a Sentence.");
l=name.length();
System.out.println("The entered sentence="+name);
System.out.println("No.of characters in the entered sentence="+l);
System.out.println("The entered sentence in reverse=");
	for(int i=l-1;i>=0;i--)
	{
		System.out.print(name.charAt(i));
	}
}
}