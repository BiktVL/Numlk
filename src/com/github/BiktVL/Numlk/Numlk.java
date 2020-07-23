package com.github.BiktVL.Numlk;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import static java.awt.Label.RIGHT;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Numlk extends Frame{
	Numlk(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		Button btn0=new Button("0");
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		Button btn5=new Button("5");
		Button btn6=new Button("6");
		Button btn7=new Button("7");
		Button btn8=new Button("8");
		Button btn9=new Button("9");
		Button btnPoint=new Button(".");
		Button btnPlus=new Button("+");
		Button btnMinus=new Button("-");
		Button btnMultiply=new Button("*");
		Button btnDivision=new Button("/");
		Label lbl=new Label("0",RIGHT);
		btn0.setBounds(10,215,105,50);
		btn1.setBounds(10,160,50,50);
		btn2.setBounds(65,160,50,50);
		btn3.setBounds(120,160,50,50);
		btn4.setBounds(10,105,50,50);
		btn5.setBounds(65,105,50,50);
		btn6.setBounds(120,105,50,50);
		btn7.setBounds(10,50,50,50);
		btn8.setBounds(65,50,50,50);
		btn9.setBounds(120,50,50,50);
		btnPoint.setBounds(120,215,50,50);
		btnPlus.setBounds(175,215,50,50);
		btnMinus.setBounds(175,160,50,50);
		btnMultiply.setBounds(175,105,50,50);
		btnDivision.setBounds(175,50,50,50);
		lbl.setBounds(10,15,215,50);
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("0");
			}
		});
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("1");
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("2");
			}
		});
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("3");
			}
		});
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("4");
			}
		});
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("5");
			}
		});
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("6");
			}
		});
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("7");
			}
		});
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("8");
			}
		});
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("9");
			}
		});
		btnPoint.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText(".");
			}
		});
		btnPlus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("+");
			}
		});
		btnMinus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("-");
			}
		});
		btnMultiply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("*");
			}
		});
		btnDivision.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("/");
			}
		});
		add(btn0);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnPoint);
		add(btnPlus);
		add(btnMinus);
		add(btnMultiply);
		add(btnDivision);
		add(lbl);
		setSize(240,280);
		setLayout(null);
		setVisible(true);
	}  
	
	public static void main(String args[]){
	Numlk f=new Numlk();  
	}
}