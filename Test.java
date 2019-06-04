import java.awt.*;
class Test extends Frame
{
Button b;
Label l;
TextField t1;
public Test()
{
b=new Button("Click Here");
l=new Label("Enter Name");
t1=new TextField(20);
setLayout(new FlowLayout());
add(l);
add(t1);
add(b);
setSize(400,400);
setVisible(true);
}
public static void main(String arg[])
{
Test t=new Test();
}
}