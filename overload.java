import javax.swing.*;
class demo2
{
public void sum()
{
System.out.println(10+20);
}
public void sum(int a,int b)
{
System.out.println(a+b);
}
public void sum(int a,int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String arg[])
{demo2 d=new demo2();
d.sum();
d.sum(10,30);
d.sum(20,30,40);
}
}