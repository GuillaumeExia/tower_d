package com.towerdefense.display;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.towerdefense.events.MouseHandler;

public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static String title = "Tower Defense";
	private static Dimension sizeDimension = new Dimension(800, 600);
	public static MouseHandler mouseEvent = new MouseHandler();
	public static MouseHandler mouseMotionEvent = new MouseHandler();
	public PanelMenu panelMenu = new PanelMenu();
	CardLayout cardManager = new CardLayout();

	public Window() {
		this.init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private void init() {
		this.setTitle(Window.title);
		this.setSize(Window.sizeDimension);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(this.panelMenu);
		this.setVisible(true);
	}
}
