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
public static void main(String arg[])
{
First f1=new First();
First f2=new First(30,40);
f1.sum();
f2.sum();
f1=f2;
f1.sum();
}
}