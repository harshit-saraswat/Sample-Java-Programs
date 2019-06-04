import java.awt.*;

class choice_test extends Frame{
	
	Frame f;
	Choice city;
	choice_test(){
		
		f=new Frame();
		city=new Choice();
		city.add("New Delhi");
		city.add("Kanpur");
		city.add("Kolkata");
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setSize(500,500);
		f.add(city);
	}
	
	public static void main(String args[]){
		choice_test obj1=new choice_test();
	}
}