import java.io.*;
class D
{
public static void main(String arg[])
{
FileInputStream fi=null;
try
{
	fi=new FileInputStream("abc.txt");
	int ch,c=0,w=0;
	while((ch=fi.read())!=-1)
	{
		c++;
		if(ch==' '||ch=='\n')
		{
			w++;
		}
	}
	w++;
	System.out.println("No. of characters in file are:"+c);
	System.out.println("No. of words in file are:"+w);
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
	}
	catch(Exception e2)
	{
		System.out.println(e2);
	}
}
}
}