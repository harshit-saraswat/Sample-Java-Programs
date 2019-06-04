class A extends Thread
{
public void run()
{
try
{
for(int n=1;n<=10;n++)
{
System.out.println("A:"+n);
sleep(1000);
}
}
catch(Exception e){}
}
}
class B extends Thread
{
public void run()
{
try
{
for(int n=1;n<=10;n++)
{
System.out.println("B:"+n);
sleep(1000);
}
}
catch(Exception e){}
}
}
class C extends Thread
{
public void run()
{
try
{
for(int n=1;n<=10;n++)
{
System.out.println("C:"+n);
sleep(1000);
}
}
catch(Exception e){}
}
}
class T3
{
public static void main(String arg[])
{
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
}
}