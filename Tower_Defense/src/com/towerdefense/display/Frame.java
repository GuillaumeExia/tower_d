package com.towerdefense.display;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.towerdefense.events.MouseHandler;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static String title = "Tower Defense";
	private static Dimension sizeDimension = new Dimension(800, 600);
	public static MouseHandler mouseEvent = new MouseHandler();
	public static MouseHandler mouseMotionEvent = new MouseHandler();
	public static JLabel statusBarLabel;
	public PanelMenu panelMenu = new PanelMenu(this);

	public Frame() {
		/* INITIALISATION */
		this.setTitle(Frame.title);
		this.setSize(Frame.sizeDimension);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* FIN INITIALISATION */

		/* PANEL */
		this.setContentPane(this.panelMenu);
		/* FIN PANEL */

		this.setVisible(true);

		this.panelMenu.repaint();

	}
}
