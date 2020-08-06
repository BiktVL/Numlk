package com.github.BiktVL.Numlk;

import static java.awt.Label.RIGHT;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// NumLockTrainer
public class Numlk {
	private Frame mainFrame;
	private Label lbl = new Label();	
	private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPoint, btnPlus, btnMinus, btnMultiply, btnDivision, btnEqual;
	
	private void prepareGUI() {
		
		lbl.setBounds(10,15,215,50);
		lbl.setFocusable(true);
		lbl.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				lbl.setText(KeyEvent.getKeyText(e.getKeyCode()));
			}
			public void keyReleased(KeyEvent e) {
			}
			public void keyTyped(KeyEvent e) {
			}
		});
		
		btn7 = new Button();
		btn7.setBounds(10,70,50,50);
		btn7.setFocusable(false);
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("7");
			}
		});
		
		btn8 = new Button();
		btn8.setBounds(65,70,50,50);
		btn8.setFocusable(false);
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("8");
			}
		});
		
		btn9 = new Button();
		btn9.setBounds(120,70,50,50);
		btn9.setFocusable(false);
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("9");
			}
		});
		
		btnDivision = new Button();
		btnDivision.setBounds(175,70,50,50);
		btnDivision.setFocusable(false);
		btnDivision.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("/");
			}
		});
		
		btn4 = new Button();
		btn4.setBounds(10,125,50,50);
		btn4.setFocusable(false);
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("4");
			}
		});

		btn5 = new Button();
		btn5.setBounds(65,125,50,50);
		btn5.setFocusable(false);
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("5");
			}
		});
		
		btn6 = new Button();
		btn6.setBounds(120,125,50,50);
		btn6.setFocusable(false);
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("6");
			}
		});
		
		btnMultiply = new Button();
		btnMultiply.setBounds(175,125,50,50);
		btnMultiply.setFocusable(false);
		btnMultiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("*");
			}
		});
		
		btn1 = new Button();
		btn1.setBounds(10,180,50,50);
		btn1.setFocusable(false);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("1");
			}
		});
		
		btn2 = new Button();
		btn2.setBounds(65,180,50,50);
		btn2.setFocusable(false);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("2");
			}
		});
		
		btn3 = new Button();
		btn3.setBounds(120,180,50,50);
		btn3.setFocusable(false);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("3");
			}
		});
		
		btnMinus = new Button();
		btnMinus.setBounds(175,180,50,50);
		btnMinus.setFocusable(false);
		btnMinus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("-");
			}
		});		
		
		btn0 = new Button();
		btn0.setBounds(10,235,50,50);
		btn0.setFocusable(false);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("0");
			}
		});
		
		btnEqual = new Button();
		btnEqual.setBounds(65,235,50,50);
		btnEqual.setFocusable(false);
		btnEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("=");
			}
		});
				
		btnPoint = new Button();
		btnPoint.setBounds(120,235,50,50);
		btnPoint.setFocusable(false);
		btnPoint.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText(".");
			}
		});
		
		btnPlus = new Button();
		btnPlus.setBounds(175,235,50,50);
		btnPlus.setFocusable(false);
		btnPlus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("+");
			}
		});
			
		mainFrame = new Frame();
		mainFrame.setSize(235,295);
		mainFrame.setLayout(null);
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		mainFrame.add(lbl);
		mainFrame.add(btn0);
		mainFrame.add(btn1);
		mainFrame.add(btn2);
		mainFrame.add(btn3);
		mainFrame.add(btn4);
		mainFrame.add(btn5);
		mainFrame.add(btn6);
		mainFrame.add(btn7);
		mainFrame.add(btn8);
		mainFrame.add(btn9);
		mainFrame.add(btnEqual);
		mainFrame.add(btnPoint);
		mainFrame.add(btnPlus);
		mainFrame.add(btnMinus);
		mainFrame.add(btnMultiply);
		mainFrame.add(btnDivision);
		mainFrame.setVisible(true);
	}
	
	private void showNumlk() {
		mainFrame.setTitle("Numlock keyboard");
		lbl.setText("0");
		lbl.setAlignment(RIGHT);
		btn0.setLabel("0");
		btn1.setLabel("1");
		btn2.setLabel("2");
		btn3.setLabel("3");
		btn4.setLabel("4");
		btn5.setLabel("5");
		btn6.setLabel("6");
		btn7.setLabel("7");
		btn8.setLabel("8");
		btn9.setLabel("9");
		btnEqual.setLabel("=");
		btnPoint.setLabel(".");
		btnPlus.setLabel("+");
		btnMinus.setLabel("-");
		btnMultiply.setLabel("*");
		btnDivision.setLabel("/");
	}
	
	public Numlk() {
		prepareGUI();
	}
	
	public static void main(String[] args) {
		Numlk numlk = new Numlk();
		numlk.showNumlk();
	}
}
