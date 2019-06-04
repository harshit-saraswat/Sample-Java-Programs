import javax.swing.*;
class A3
{
public void sum(int x,int y)
{
int z;
z=x+y;
System.out.println("I am Sum Method and result is"+z);
}
public void sub(int x,int y)
{
int z;
z=y-x;
System.out.println("I am Sub Method and result is"+z);
}
public static void main(String arg[])
{int x,y;
x=Integer.parseInt(JOptionPane.showInputDialog("Enter Ist No."));
y=Integer.parseInt(JOptionPane.showInputDialog("Enter IInd No."));
A3 ob=new A3();
ob.sum(x,y);
ob.sub(x,y);
}
}