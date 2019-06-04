import java.awt.*;

class label_test extends Frame{
	
	Frame f;
	Label l;
	label_test(){
		
		f= new Frame("Label Test");
		l=new Label("Hello Java");
		String str=l.getText();
		l.setBounds(100,200,300,400);
		f.add(l);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
	}
	
	public static void main(String args[]){
		label_test obj1=new label_test();
	}
}