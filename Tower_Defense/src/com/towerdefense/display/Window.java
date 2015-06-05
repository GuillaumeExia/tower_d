package com.towerdefense.display;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.towerdefense.events.MouseHandler;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	private static String title = "Tower Defense";
	private static Dimension sizeDimension = new Dimension(800, 600);
	public static MouseHandler mouseEvent = new MouseHandler();
	public static MouseHandler mouseMotionEvent = new MouseHandler();
	public PanelMenu panelMenu = new PanelMenu();

	public Window() {

		this.init();
	}

	private void init() {
		/* INITIALISATION */
		this.setTitle(Window.title);
		this.setSize(Window.sizeDimension);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(this.panelMenu);

		this.setVisible(true);

	}
}
