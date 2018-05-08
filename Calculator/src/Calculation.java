import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculation extends JFrame{

	private static final long serialVersionUID = 1L;

	public Calculation() {
	
	this.setTitle("계산기 프레임");
	this.setSize(400,400);
	this.setVisible(true);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	JButton Button0 = new JButton("0");
	JButton Button1 = new JButton("1");
	JButton Button2 = new JButton("2");
	JButton Button3 = new JButton("3");
	JButton Button4 = new JButton("4");
	JButton Button5 = new JButton("5");
	JButton Button6 = new JButton("6");
	JButton Button7 = new JButton("7");
	JButton Button8 = new JButton("8");
	JButton Button9 = new JButton("9");
	JButton Button_CE = new JButton("CE");
	JButton Button_Cal = new JButton("계산");
	JButton Button_A = new JButton("+");
	JButton Button_S = new JButton("-");
	JButton Button_M = new JButton("*");
	JButton Button_D = new JButton("/");
	
	JLabel jl_1 = new JLabel("수식입력");
	JLabel jl_2 = new JLabel("계산 결과");
	JPanel jp_1 = new JPanel();
	JPanel jp_2 = new JPanel();
	JPanel jp_3 = new JPanel();
	JTextField text = new JTextField(30);
	JTextField text_R = new JTextField(30);
	
	jp_1.setBackground(Color.GRAY);
	jp_2.setBackground(Color.WHITE);
	jp_3.setBackground(Color.YELLOW);
	jp_2.setLayout(new GridLayout(4,4,5,5));
	
	Color blue = new Color(0,255,255);
	Button_A.setBackground(blue);
	Button_S.setBackground(blue);
	Button_M.setBackground(blue);
	Button_D.setBackground(blue);

		jp_1.add(jl_1);
		jp_1.add(text);
		this.add(jp_1,"North");
		
		
		jp_2.add(Button0);
		jp_2.add(Button1);
		jp_2.add(Button2);
		jp_2.add(Button3);
		jp_2.add(Button4);
		jp_2.add(Button5);
		jp_2.add(Button6);
		jp_2.add(Button7);
		jp_2.add(Button8);
		jp_2.add(Button9);
		jp_2.add(Button_CE);
		jp_2.add(Button_Cal);
		jp_2.add(Button_A);
		jp_2.add(Button_S);
		jp_2.add(Button_M);
		jp_2.add(Button_D);
		this.add(jp_2);
		
		
		jp_3.add(jl_2);
		jp_3.add(text_R);
		this.add(jp_3, "South");
		this.setVisible(true);
		
	}
			
	public static void main(String[] args) {
		Calculation c = new Calculation();
	}

}
