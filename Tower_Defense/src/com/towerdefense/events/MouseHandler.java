package com.towerdefense.events;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.towerdefense.display.Frame;
import com.towerdefense.display.PanelMenu;

public class MouseHandler implements MouseListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// Frame.statusBarLabel.setText(String.format("Clic à %d,%d", e.getX(),
		// e.getY()));

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// Frame.statusBarLabel.setText("Drag and drop en cours!");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Frame.statusBarLabel.setText("Le curseur est dans le panel");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Frame.statusBarLabel.setText("Le curseur a quitté le panel");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		PanelMenu.mouse = new Point(e.getX(), e.getY());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Frame.statusBarLabel.setText("Bouton pressé!");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Frame.statusBarLabel.setText("Bouton relâché!");

	}

}
