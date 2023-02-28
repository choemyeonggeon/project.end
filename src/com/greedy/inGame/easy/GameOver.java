package com.greedy.inGame.easy;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.resultPage.ScorePage;

public class GameOver extends JFrame {

	private JFrame mf = new JFrame();

	public GameOver() { 

		this.mf = this;
		mf.setSize(382, 371);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);

		mf.setTitle("진격의 DRAGON");

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);

		panel.setLayout(null);

//		ImageIcon bg = new ImageIcon("images/hardBg2.png");
		ImageIcon gameOver = new ImageIcon("images/gameOver.png");

//		JLabel bgLb = new JLabel(bg);
//		bgLb.setSize(1178, 737);
		
		JLabel gameOverLb = new JLabel(gameOver);
		gameOverLb.setSize(367, 336);
//		gameOverLb.setBounds(400, 200, 367, 336);

		JButton button = new JButton();
		button.setBorderPainted(false); 
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setBounds(134, 260, 100, 50);
 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mf.dispose();
				new ScorePage().display();;

			}
		});
		panel.add(button);
		panel.add(gameOverLb);
//		panel.add(bgLb);

		mf.add(panel); 


		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}