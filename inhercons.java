import javax.swing.*;
class First
{
int a,b;
public First()
{
a=10;
b=20;
}
public First(int x, int y)
{
a=x;
b=y;
}
public void sum()
{
System.out.println(a+b);
}
}
class Second extends First
{
public Second()
{
super();
}
public Second(int x,int y)
{
super(x,y);
}
public static void main(String arg[])
{
Second s1=new Second();
Second s2=new Second(30,40);
s1.sum();
s2.sum();
}
}