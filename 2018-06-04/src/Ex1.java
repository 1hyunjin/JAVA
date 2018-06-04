import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1 extends JFrame {

	
	Ex1(){
		setTitle("¿Ã∫•∆Æ");
		setSize(300,300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton jb1 = new JButton("Action");
		jb1.addActionListener(new MyButtonListener());
		
		c.add(jb1);
		setVisible(true);
	}
	class MyButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)(e.getSource()); 
			b.setBackground(Color.GREEN);
			
		}
		
	}
	
	
	
	
	
}
