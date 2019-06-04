import java.awt.*;

class button_test extends Frame{

	Frame f;
	Button b1;
	
	button_test(){
		f= new Frame("Button Test");
		b1= new Button("Submit Form");
		b1.setBounds(100,200,300,400);
		f.add(b1);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
	}
	
	public static void main(String args[]){
		button_test obj1= new button_test();
	}
}