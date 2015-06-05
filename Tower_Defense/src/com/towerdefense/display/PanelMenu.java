package com.towerdefense.display;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;

public class PanelMenu extends JPanel {

	private static final long serialVersionUID = 1L;

	public static Point mouse = new Point(0, 0);

	public PanelMenu(Frame frame) {

		frame.addMouseListener(new MouseHandler());
		frame.addMouseMotionListener(new MouseHandler());
	}

	@Override
	public void paintComponent(Graphics g) {

	}
}
