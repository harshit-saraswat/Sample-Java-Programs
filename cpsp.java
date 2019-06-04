import javax.swing.*;
class profitloss
{
public static void main(String arg[])
{
	int cp,sp,prof,loss;
	cp=Integer.parseInt(JOptionPane.showInputDialog("Enter Cost Price"));
	sp=Integer.parseInt(JOptionPane.showInputDialog("Enter Selling Price"));
	if(sp>cp)
	{
	prof=sp-cp;
	System.out.println("The profit is of Rs."+prof);
	}
	else
	{
	loss=cp-sp;
	System.out.println("The loss is of Rs."+loss);
	}
}
}