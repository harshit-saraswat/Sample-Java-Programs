import javax.swing.*;
class Demo
{
public static void main(String arg[])
{
String name=JOptionPane.showInputDialog("Enter a name");
System.out.println("Name=:"+name);
System.out.println("Upper Case=:"+name.toUpperCase());
System.out.println("Lower Case=:"+name.toLowerCase());
System.out.println("Length=:"+name.length());
}
}