import java.awt.*;
import javax.swing.*;

public class Project extends JFrame {
	public Project() {
		setTitle("����");
		setSize(300,200);
		Container c = getContentPane();
		setLayout(new FlowLayout(FlowLayout.LEFT)); //FlowLayout = ����. 
		JLabel jl1 = new JLabel("�����Է�");
		c.add(jl1);
		JTextField jt1 = new JTextField(16);
		c.add(jt1);
		c.add(new CPanel());
		c.add( new BPanel());
		setVisible(true);
	}
	
	class CPanel extends JPanel{
		public CPanel() {
		setLayout(new GridLayout(2,3,5,5));//��,��,�ȼ�,�ȼ�
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
			JLabel jl2 = new JLabel("��� ���");
			add(jl2);
			JTextField jt2 = new JTextField(16);
			add(jt2);
		}
	}
	
}
