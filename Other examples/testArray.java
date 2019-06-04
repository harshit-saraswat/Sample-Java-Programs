import java.io.*;

class testArray{

public static void main(String args[]) throws IOException{

int[] list = new int[5];
int i, tot, max, min;

max=tot=0;
min=1000;

InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

System.out.println("Enter an array:");
for(i=0;i<list.length;i++){
	list[i]=Integer.parseInt(bufferedReader.readLine());
	tot+=list[i];
	
	if(max<list[i])
		max = list[i];
	
	if(min>list[i])
		min = list[i];
}

System.out.print("Entered array:\n");
for(i=0;i<list.length;i++)
	System.out.println(list[i]+"\t");

System.out.println("\nTotal= "+tot+"\nMax= "+max+"\nMin= "+min);

}

}