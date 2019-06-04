import javax.swing.*;
class marks
{
public static void main(String arg[])
{
int sub1,sub2,sub3,total,percent;
char grade;
System.out.println("This is a grading System!");
sub1=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of subject 1:"));
sub2=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of subject 2:"));
sub3=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of subject 3:"));
total=sub1+sub2+sub3;
percent=total/3;
System.out.println("Total marks of given student are: "+total);
System.out.println("Percentage of given student is: "+percent);
	if(percent>80)
	grade='A';
	else if(percent>60&&percent<=80)
	grade='B';
	else if(percent>40&&percent<=60)
	grade='C';
	else
	grade='F';
System.out.print("Grade of given student is: "+grade);
}
}