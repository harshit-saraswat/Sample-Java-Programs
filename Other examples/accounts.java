import java.io.*;

class accounts{

static double rate;
public static void main(String args[]) throws IOException{

InputStreamReader inputStreamReader = new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

System.out.println("Enter account no.:");
int accountNo = Integer.parseInt(bufferedReader.readLine());

System.out.println("Enter name:");
String name = bufferedReader.readLine();

System.out.println("Enter amount:");
int amount = Integer.parseInt(bufferedReader.readLine());

System.out.println("Enter time:");
int time = Integer.parseInt(bufferedReader.readLine());

rate = 10;

double interest = (amount*rate*time)/400;
double total = amount+interest;

System.out.println("Name: "+name+"\nAccount No.: "+accountNo+"\nInterest: "+interest+"\nTotal Amount: "+total);

}

}