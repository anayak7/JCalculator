import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JCalculator  {
	JFrame frame = new JFrame("Calculator"); //creating a frame object name calculator
	JPanel panel = new JPanel(); //creating a panel object
	JTextArea text = new JTextArea(3, 26); //creating new text area object
	//creating buttons for the calculator
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mul = new JButton("x");
	JButton div = new JButton("/");
	JButton equals = new JButton("=");
	JButton clear = new JButton("CLEAR");
	JButton dec = new JButton(".");
	JButton sign = new JButton("+-");
	
	//variable to hold result & numbers
	static double result = 0;
	static double a;
	static double b;
	static String num1 = " ", num2 = " ", res = " ", op = " ";
	
	boolean neg = false;

	//constructor
	public JCalculator()
	{
		//creating the frame 
		frame.setVisible(true); //making sure the frame is visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting default close behavior to exit constant
		frame.setSize(350, 450); //leaving the layout manager to decide the dimensions of the frame
		frame.add(panel); //placing panel inside the frame
		
		Font font = new Font("Courier New", Font.PLAIN, 22); //creating the font for text

		//setting panel attributes
		panel.setBackground(Color.DARK_GRAY); //setting panel color to be dark gray
		panel.add(text); //placing the text area inside panel
		
		//setting text area attributes
		text.setBackground(Color.BLACK); //setting text area to be black
		text.setFont(font); //setting font
		text.setForeground(Color.WHITE); //setting color of text
		text.setPreferredSize(new Dimension(3, 25)); //the amount of text that can fit needs to match the dimensions of text area
		text.setLineWrap(true);
		
		//adding buttons to panel & setting them
		equals.setPreferredSize(new Dimension(140, 40));
		equals.setFont(font);
		equals.setForeground(Color.BLACK);
		equals.setBackground(Color.LIGHT_GRAY);
		equals.setOpaque(true);
		equals.setBorderPainted(false);
		panel.add(equals);
		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("inside equals method, result is: " + result);
				ops(op);
				text.setText(result + "");
				
			}
			});
		
		clear.setPreferredSize(new Dimension(140, 40));
		clear.setFont(font);
		clear.setForeground(Color.BLACK);
		clear.setBackground(Color.LIGHT_GRAY);
		clear.setOpaque(true);
		clear.setBorderPainted(false);
		panel.add(clear);
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				text.setText("");
				res = " ";
				result = 0;
			}
			});

		
		b0.setPreferredSize(new Dimension(70, 70));
		b0.setFont(font);
		b0.setForeground(Color.BLACK);
		b0.setBackground(Color.LIGHT_GRAY);
		b0.setOpaque(true);
		b0.setBorderPainted(false);
		panel.add(b0);
		b0.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			text.append("0");
			
			if(num1 == " ")
			{
				a = 0;
				num1 = "1";

				
			} else {
				
				b = 0;
				num2 = "1";
			}
		}
		});

		
		b1.setPreferredSize(new Dimension(70, 70));
		b1.setFont(font);
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		panel.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-1");
				} else {
					text.append("1");
				}
				if(num1 == " ")
				{
					a = 1;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 1;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b2.setPreferredSize(new Dimension(70, 70));
		b2.setFont(font);
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		panel.add(b2);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-2");
				} else {
					text.append("2");
				}
				if(num1 == " ")
				{
					a = 2;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 2;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b3.setPreferredSize(new Dimension(70, 70));
		b3.setFont(font);
		b3.setForeground(Color.BLACK);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		panel.add(b3);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-3");
				} else {
					text.append("3");
				}
				if(num1 == " ")
				{
					a = 3;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 3;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b4.setPreferredSize(new Dimension(70, 70));
		b4.setFont(font);
		b4.setForeground(Color.BLACK);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setOpaque(true);
		b4.setBorderPainted(false);
		panel.add(b4);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-4");
				} else {
					text.append("4");
				}
				if(num1 == " ")
				{
					a = 4;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 4;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b5.setPreferredSize(new Dimension(70, 70));
		b5.setFont(font);
		b5.setForeground(Color.BLACK);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setOpaque(true);
		b5.setBorderPainted(false);
		panel.add(b5);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-5");
				} else {
					text.append("5");
				}
				if(num1 == " ")
				{
					a = 5;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 5;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b6.setPreferredSize(new Dimension(70, 70));
		b6.setFont(font);
		b6.setForeground(Color.BLACK);
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setOpaque(true);
		b6.setBorderPainted(false);
		panel.add(b6);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-6");
				} else {
					text.append("6");
				}
				if(num1 == " ")
				{
					a = 6;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 6;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
			}
			});

		
		b7.setPreferredSize(new Dimension(70, 70));
		b7.setFont(font);
		b7.setForeground(Color.BLACK);
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setOpaque(true);
		b7.setBorderPainted(false);
		panel.add(b7);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-7");
				} else {
					text.append("7");
				}
				if(num1 == " ")
				{
					a = 7;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 7;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
			
				}
			}
			});

		
		b8.setPreferredSize(new Dimension(70, 70));
		b8.setFont(font);
		b8.setForeground(Color.BLACK);
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setOpaque(true);
		b8.setBorderPainted(false);
		panel.add(b8);
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-8");
				} else {
					text.append("8");
				}
				if(num1 == " ")
				{
					a = 8;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
					
				} else {
					
					b = 8;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
					
				}
			}
			});

		
		b9.setPreferredSize(new Dimension(70, 70));
		b9.setFont(font);
		b9.setForeground(Color.BLACK);
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setOpaque(true);
		b9.setBorderPainted(false);
		panel.add(b9);
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(neg == true)
				{
					text.append("-9");
				} else {
					text.append("9");
				}
				
				if(num1 == " ")
				{
					a = 9;
					num1 = "1";
					if(neg == true)
					{
						a *= -1;
						neg = false;
					}
				} else {
					
					b = 9;
					num2 = "1";
					if(neg == true)
					{
						b *= -1;
						neg = false;
					}
				}
				
			}
			});

		
		sign.setPreferredSize(new Dimension(70, 70));
		sign.setFont(font);
		sign.setForeground(Color.BLACK);
		sign.setBackground(Color.LIGHT_GRAY);
		sign.setOpaque(true);
		sign.setBorderPainted(false);
		panel.add(sign);
		sign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				neg = true;				
			}
			});

		
		dec.setPreferredSize(new Dimension(70, 70));
		dec.setFont(font);
		dec.setForeground(Color.BLACK);
		dec.setBackground(Color.LIGHT_GRAY);
		dec.setOpaque(true);
		dec.setBorderPainted(false);
		panel.add(dec);
		dec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				text.append(".");
			}
			});

		
		add.setPreferredSize(new Dimension(70, 70));
		add.setFont(font);
		add.setForeground(Color.BLACK);
		add.setBackground(Color.LIGHT_GRAY);
		add.setOpaque(true);
		add.setBorderPainted(false);
		panel.add(add);
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("inside the add method.");
				System.out.println("a is: " + a + " b is: " + b);

				text.append("+");
				op = "+";
				 
			}
			});

		
		sub.setPreferredSize(new Dimension(70, 70));
		sub.setFont(font);
		sub.setForeground(Color.BLACK);
		sub.setBackground(Color.LIGHT_GRAY);
		sub.setOpaque(true);
		sub.setBorderPainted(false);
		panel.add(sub);
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("inside the sub method.");
				System.out.println("a is: " + a + " b is: " + b);
				
				text.append("-");
				op = "-";
			}
			});

		
		mul.setPreferredSize(new Dimension(70, 70));
		mul.setFont(font);
		mul.setForeground(Color.BLACK);
		mul.setBackground(Color.LIGHT_GRAY);
		mul.setOpaque(true);
		mul.setBorderPainted(false);
		panel.add(mul);
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("inside the mul method.");
				System.out.println("a is: " + a + " b is: " + b);
				
				text.append("x");
				op = "x";
			}
			});

		
		div.setPreferredSize(new Dimension(70, 70));
		div.setFont(font);
		div.setForeground(Color.black);
		div.setBackground(Color.LIGHT_GRAY);
		div.setOpaque(true);
		div.setBorderPainted(false);
		panel.add(div);	
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("inside the div method.");
				System.out.println("a is: " + a + " b is: " + b);
				
				text.append("/");
				op = "/";
			}
			});	
		
	}
	
	public static void ops(String op)
	{
		System.out.println("inside ops func. a is: " + a + " b is: " + b);
		double ans = 0;
		
		if(op == "+")
		{
			if(res == " ")
			{
				result = a + b;
				
			} else {
				
				if(num2 == " ")
				{
					result += a;
					
				} else {
				
					ans = a + b;
					result += ans;
		
				}
			}
		}
		else if(op == "-")
		{
			if(res == " ")
			{
				result = a - b;
				
			} else {
				
				if(num2 == " ")
				{
					result -= a;
					
				} else {
					
					ans = a - b;
					result += ans;
				}
			}
			
		}
		else if(op == "x")
		{
			if(res == " ")
			{
				result = a * b;
				
			} else {
				
				if(num2 == " ")
				{
					result *= a;
					
				} else {
			
					ans = a * b;
					result += ans;

				}
			}
		}
		else if(op == "/")
		{
			if(res == " ")
			{
				result = a / b;
				
			} else {
				
				if(num2 == " ")
				{
					result /= a;
					
				} else {
					
					ans = a / b;
					result += ans;
				}
			}
		}
		
		res = "1";
		//resetting variables
		num1 = num2 = " ";
		op = " ";
		a = b = 0;
	}
	
	public static void main(String[] args) {
		
		new JCalculator();		
	}

	
}
