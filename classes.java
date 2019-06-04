import javax.swing.*;
class First
{
public void msg()
{
System.out.println("First");
}
}
class Second
{
public void msg2()
{
System.out.println("Second");
}
public static void main(String arg[])
{
First f=new First();
Second s=new Second();
f.msg();
s.msg2();
}
}