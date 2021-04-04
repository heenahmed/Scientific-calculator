import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 385, 29);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 51, 385, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFract = new JButton("1/x");
		btnFract.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnFract.setBounds(10, 188, 56, 39);
		frame.getContentPane().add(btnFract);
		
		JButton btnPow = new JButton("X^Y");
		btnPow.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPow.setBounds(10, 238, 56, 39);
		frame.getContentPane().add(btnPow);
		
		JButton btnPower3 = new JButton("X^3");
		btnPower3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPower3.setBounds(10, 288, 56, 39);
		frame.getContentPane().add(btnPower3);
		
		JButton btnPower2 = new JButton("X^2");
		btnPower2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPower2.setBounds(10, 338, 56, 39);
		frame.getContentPane().add(btnPower2);
		
		JButton btnN = new JButton("n!");
		btnN.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnN.setBounds(10, 388, 56, 39);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlusMinus.setBounds(10, 438, 56, 39);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercent.setBounds(94, 238, 56, 39);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(94, 288, 56, 39);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(94, 338, 56, 39);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(94, 388, 56, 39);
		frame.getContentPane().add(btn1);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_11.getText();
				textField.setText(number);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(94, 438, 132, 39);
		frame.getContentPane().add(button_11);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(170, 238, 56, 39);
		frame.getContentPane().add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(170, 288, 56, 39);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(170, 338, 56, 39);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(170, 388, 56, 39);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setBounds(250, 438, 56, 39);
		frame.getContentPane().add(btndot);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnB.setBounds(250, 238, 56, 39);
		frame.getContentPane().add(btnB);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(250, 288, 56, 39);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(250, 338, 56, 39);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(250, 388, 56, 39);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result = first - second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result = first * second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result = first / second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%") {   //modulo
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(327, 438, 56, 39);
		frame.getContentPane().add(btnEqual);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(327, 238, 56, 39);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(327, 288, 56, 39);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.setBounds(327, 338, 56, 39);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(327, 388, 56, 39);
		frame.getContentPane().add(btnDiv);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnTan.setBounds(327, 138, 56, 39);
		frame.getContentPane().add(btnTan);
		
		JButton btnLog = new JButton("Log");
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnLog.setBounds(94, 188, 56, 39);
		frame.getContentPane().add(btnLog);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSinh.setBounds(170, 188, 56, 39);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCos.setBounds(250, 138, 56, 39);
		frame.getContentPane().add(btnCos);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEx.setBounds(94, 138, 56, 39);
		frame.getContentPane().add(btnEx);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnR.setBounds(10, 138, 56, 39);
		frame.getContentPane().add(btnR);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSin.setBounds(170, 138, 56, 39);
		frame.getContentPane().add(btnSin);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCosh.setBounds(250, 188, 56, 39);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnTanh.setBounds(327, 188, 56, 39);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(10, 105, 56, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnOff.setBounds(94, 105, 56, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
