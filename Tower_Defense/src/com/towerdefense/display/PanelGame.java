package com.towerdefense.display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;

public class PanelGame extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static Point mouse = new Point(0, 0);
	JLabel test = new JLabel("Je suis le panel game");

	boolean disque = false;

	public PanelGame() {
		this.addMouseListener(new MouseHandler());
		this.addMouseMotionListener(new MouseHandler());

		this.setBackground(Color.CYAN);
		this.setLayout(new BorderLayout());
		this.add(this.test, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String commande = e.getActionCommand();

		if (commande.equals("tracer")) {
			this.disque = true;
		}
		else if (commande.equals("effacer")) {
			this.disque = false;
		}
		this.repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (this.disque) {
			g.setColor(Color.RED);
		}
		else {
			g.setColor(Color.CYAN);
		}
		g.fillOval(100, 50, 100, 100);

	}
}
