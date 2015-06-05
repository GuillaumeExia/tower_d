package com.towerdefense.display;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame {
	private static String title = "Tower Defense";
	private static Dimension sizeDimension = new Dimension(800, 600);

	public Frame() {
		this.setTitle(this.getTitle());
		this.setSize(this.getSize());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.init();
	}

	private void init() {
		this.setLayout(new GridLayout(1, 1, 0, 0));

		this.setVisible(true);
	}

}
