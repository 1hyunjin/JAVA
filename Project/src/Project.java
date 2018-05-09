import java.awt.*;
import javax.swing.*;

public class Project extends JFrame {
	public Project() {
		setTitle("계산기");
		setSize(300,200);
		Container c = getContentPane();
		setLayout(new FlowLayout(FlowLayout.LEFT)); //FlowLayout = 나열. 
		JLabel jl1 = new JLabel("수식입력");
		c.add(jl1);
		JTextField jt1 = new JTextField(16);
		c.add(jt1);
		c.add(new CPanel());
		c.add( new BPanel());
		setVisible(true);
	}
	
	class CPanel extends JPanel{
		public CPanel() {
		setLayout(new GridLayout(2,3,5,5));//행,렬,픽셀,픽셀
		JButton jb1 = new JButton("0");
		JButton jb2 = new JButton("1");
		JButton jb3 = new JButton("2");
		JButton jb4 = new JButton("3");
		JButton jb5 = new JButton("4");
		JButton jb6 = new JButton("5");
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		
		}
	}
	class BPanel extends JPanel{
		public BPanel() {
			setBackground(Color.YELLOW);
			JLabel jl2 = new JLabel("계산 결과");
			add(jl2);
			JTextField jt2 = new JTextField(16);
			add(jt2);
		}
	}
	
}
