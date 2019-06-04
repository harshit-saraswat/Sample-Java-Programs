import javax.swing.*;
class A2
{
public void sum()
{
int x=1,y=10,z;
z=x+y;
System.out.println("I am Sum Method and result is"+z);
}
public void sub()
{
int x=10,y=20,z;
z=y-x;
System.out.println("I am Sub Method and result is"+z);
}
public static void main(String arg[])
{
A2 ob=new A2();
ob.sum();
ob.sub();
}
}