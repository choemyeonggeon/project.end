package com.greedy.character;



import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.inGame.easy.EasyDescriptionGlaun;
import com.greedy.inGame.hard.HardDescriptionGlaun;
import com.greedy.inGame.normal.NormalDescriptionGlaun;

public class gradeGlanun {
	
	
	public void gradeGlanun() {


		JFrame mF = new JFrame();
	    mF.setBounds(300, 200, 1280, 750);
		mF.setLocationRelativeTo(null);

	    JPanel panel = new JPanel();
	    panel.setLayout(null);
		mF.setResizable(false);
		
	    JButton button = new JButton(); 

		Image image = new ImageIcon("images/cg.PNG").getImage().getScaledInstance(1100, 700, 0);
		
	    JLabel label = new JLabel(new ImageIcon(image));
	    
	    
	    JButton button1 = new JButton(new ImageIcon("images/eazych.png"));
		JButton button2 = new JButton(new ImageIcon("images/normalch.png"));
		JButton button3 = new JButton(new ImageIcon("images/hardch.png"));
		JButton button4 = new JButton(new ImageIcon("images/back.png"));
		

	    label.setBounds(10, 10, 1200, 700);
	    button1.setBounds(160, 570, 250, 50);
	    button2.setBounds(500, 570, 250, 50);
	    button3.setBounds(840, 570, 250, 50);
	    button4.setBounds(100, 30, 70, 70);
		   
		    
	    button1.addActionListener(new ActionListener() {
	        @Override
	    	public void actionPerformed(ActionEvent e) {
	        	mF.setVisible(false);
	        	new EasyDescriptionGlaun();
	        }
	    });
	    
	    button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mF.setVisible(false);
			 new NormalDescriptionGlaun();
		 
			}
			});
	    
	   button3.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {

					mF.setVisible(false);
			        new HardDescriptionGlaun();
				}
			});
	    button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				choiceGlanun back = new choiceGlanun();
				back.Glanun();
				mF.setVisible(false);
			}
		});
	    

	    panel.add(button1); 
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(button4);
		   
	 
	    panel.add(label);

	    panel.setLayout(null);

	    mF.add(panel);

	    mF.setVisible(true);
	    mF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		
		
	}
	
	
	

