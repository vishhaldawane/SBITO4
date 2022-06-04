import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {
	public static void main(String[] args) {
		System.out.println("begin main");
		MyFrame mfr1 = new MyFrame(300,200,100,100,"MyCar");
		MyFrame mfr2 = new MyFrame(300,200,400,100,"MyTrain");
		MyFrame mfr3 = new MyFrame(300,200,700,100,"MyFlight");
		
		Thread t1 = new Thread(mfr1);
		Thread t2 = new Thread(mfr2);
		Thread t3 = new Thread(mfr3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		System.out.println("End main");
	}
}
class MyFrame extends JFrame  implements Runnable {
	JTextField ta = new JTextField(20);
	String title;
	
	MyFrame(int w, int h, int x, int y, String title) 	{
		super.setSize(w, h); //width 400 height 200
		super.setLocation(x, y);
		this.title=title;
		super.setTitle(title);
		super.setVisible(true);
		super.setLayout(new FlowLayout());
		super.add(ta);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void run() {
		for(int i=1;i<=1000000;i++) {
			ta.setText(title+" is running "+i);
		}
	}
}




