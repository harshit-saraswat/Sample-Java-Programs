import javax.swing.*;
class First
{
public void msg()
{
System.out.println("First");
}
}
class Second extends First
{
public void msg2()
{
System.out.println("Second");
}
public static void main(String arg[])
{
Second s=new Second();
s.msg();
s.msg2();
}
}