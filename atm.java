import javax.swing.*;
class bank
{
int bal,amt,choice,pass,c;
public bank()
{
bal=1000;
pass=1234;
c=0;
}
public void enter()
{
amt=Integer.parseInt(JOptionPane.showInputDialog("Enter amount you want to deposit."));
bal+=amt;
show();
}
public void take()
{
amt=Integer.parseInt(JOptionPane.showInputDialog("Enter amount you want to withdraw."));
if(amt>bal)
{
JOptionPane.showMessageDialog(null,"Insufficient balance.\nTry again.");
take();
}
else
{
bal-=amt;
show();
}
}
public void show()
{
JOptionPane.showMessageDialog(null,"Your new balance is:"+bal);
JOptionPane.showMessageDialog(null,"Going to Start Again!");
msg();
}
public void password()
{
pass=Integer.parseInt(JOptionPane.showInputDialog("Please enter your password."));
if(pass==1234)
{
msg();
}
else
{c++;
if(c==3)
{
JOptionPane.showMessageDialog(null,"You entered wrong password thrice!\nExiting!!");
System.exit(0);
}
else
password();
}
}
public void msg()
{
choice=Integer.parseInt(JOptionPane.showInputDialog("What do you want to do?\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit"));
switch(choice)
{
case 1:enter();
case 2:take();
case 3:show();
case 4:JOptionPane.showMessageDialog(null,"Exiting!!");
       System.exit(0);
default:JOptionPane.showMessageDialog(null,"Wrong choice entered.Enter appropriate choice again.");
	msg();	
}
}
public static void main(String arg[])
{
bank b=new bank();
JOptionPane.showMessageDialog(null,"Welcome To our ATM.");
b.password();
}
}