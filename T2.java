class T2
{
public static void main(String arg[])
{
Thread t=Thread.currentThread();
try
{
for(int n=1;n<=10;n++)
{
System.out.println(n);
t.sleep(1000);
}
System.out.println(t);
}
catch(Exception e){}
}
}