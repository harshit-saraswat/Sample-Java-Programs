import java.io.*;
class D
{
public static void main(String arg[])
{
FileInputStream fi=null;
FileOutputStream fo=null;
try
{
	fi=new FileInputStream("abc.txt");
	fo=new FileOutputStream("xyz.txt");
	int ch;
	while((ch=fi.read())!=-1)
	{
		fo.write(ch);
	}
}
catch(Exception e1)
{
	System.out.println(e1);
}
finally
{
	try
	{
		fi.close();
		fo.close();
	}
	catch(Exception e2)
	{
		System.out.println(e2);
	}
}
}
}