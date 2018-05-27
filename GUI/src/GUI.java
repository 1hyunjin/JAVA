import java.awt.*;
import javax.swing.*;
public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;
	public GUI() {
		setTitle("Money Changer with CheckBox");
		setSize(300,400);
		Container c = getContentPane();
		setLayout( new FlowLayout(FlowLayout.CENTER));
		JLabel jl1 = new JLabel(" 금액 ");
		c.add(jl1);
		JTextField jt1 = new JTextField(12);
		c.add(jt1);
		JButton jb1 = new JButton(" 계산 ");
		c.add(jb1);
		c.add(new Panel1());
		c.add(new Panel2());
		c.add(new Panel3());
		c.add(new Panel4());
		c.add(new Panel5());
		c.add(new Panel6());
		c.add(new Panel7());
		c.add(new Panel8());
		c.setBackground(new Color(255,153,102));
		setVisible(true);
	}
	
	class Panel1 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel1() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl2 = new JLabel("오만원");
			add(jl2);
			JTextField jt2 = new JTextField(10);
			add(jt2);
			JCheckBox jcb1 = new JCheckBox();
			jcb1.setBackground(new Color(255,153,102));
			add(jcb1);
			this.setBackground(new Color(255,153,102));
			
			}	
	}
	
	class Panel2 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel2() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl3 = new JLabel(" 만원");
			add(jl3);
			JTextField jt3 = new JTextField(10);
			add(jt3);
			JCheckBox jcb2 = new JCheckBox();
			jcb2.setBackground(new Color(255,153,102));
			add(jcb2);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel3 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel3() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl4 = new JLabel(" 천원 ");
			add(jl4);
			JTextField jt4 = new JTextField(10);
			add(jt4);
			JCheckBox jcb3 = new JCheckBox();
			jcb3.setBackground(new Color(255,153,102));
			add(jcb3);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel4 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel4() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl5 = new JLabel(" 500원");
			add(jl5);
			JTextField jt5 = new JTextField(10);
			add(jt5);
			JCheckBox jcb4 = new JCheckBox();
			jcb4.setBackground(new Color(255,153,102));
			add(jcb4);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel5 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel5() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl6 = new JLabel(" 100원");
			add(jl6);
			JTextField jt6 = new JTextField(10);
			add(jt6);
			JCheckBox jcb5 = new JCheckBox();
			jcb5.setBackground(new Color(255,153,102));
			add(jcb5);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel6 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel6() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl7 = new JLabel("  50원");
			add(jl7);
			JTextField jt7 = new JTextField(10);
			add(jt7);
			JCheckBox jcb6 = new JCheckBox();
			jcb6.setBackground(new Color(255,153,102));
			add(jcb6);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel7 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel7() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl8 = new JLabel("  10원");
			add(jl8);
			JTextField jt8 = new JTextField(10);
			add(jt8);
			JCheckBox jcb7 = new JCheckBox();
			jcb7.setBackground(new Color(255,153,102));
			add(jcb7);
			this.setBackground(new Color(255,153,102));
		}
	}
	class Panel8 extends JPanel{
		private static final long serialVersionUID = 1L;
		public Panel8() {
			setLayout(new FlowLayout(FlowLayout.CENTER)); 
			JLabel jl9 = new JLabel("  1원");
			add(jl9);
			JTextField jt9 = new JTextField(10);
			add(jt9);
			JCheckBox jcb8 = new JCheckBox();
			jcb8.setBackground(new Color(255,153,102));
			add(jcb8);
			this.setBackground(new Color(255,153,102)); 
		}
	}	
}

