package com.towerdefense.display;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;

public class PanelGame extends JPanel {

	private static final long serialVersionUID = 1L;

	public static Point mouse = new Point(0, 0);

	public PanelGame(Window window) {

		window.addMouseListener(new MouseHandler());
		window.addMouseMotionListener(new MouseHandler());
	}

	@Override
	public void paintComponent(Graphics g) {

	}

}
