package com.towerdefense.display;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.towerdefense.events.MouseHandler;

public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static String title = "Tower Defense";
	private static Dimension sizeDimension = new Dimension(800, 600);
	public static MouseHandler mouseEvent = new MouseHandler();
	public static MouseHandler mouseMotionEvent = new MouseHandler();
	public static Point mouse = new Point(0, 0);
	JPanel panelMenu = new JPanel();
	PanelGame panelGame = new PanelGame();

	CardLayout cardManager = new CardLayout();
	JButton btnPlay = new JButton("Play");
	JButton btnLoad = new JButton("Load");
	JButton btnLeaderBoard = new JButton("LeaderBoard");
	JButton btnExit = new JButton("Exit");

	public Window() {
		this.init();
		this.panelMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals("Play")) {
			NicknameAsker asker = new NicknameAsker();
			this.setContentPane(this.panelGame);
			this.repaint();
			this.revalidate();
		}
		else if (action.equals("Load")) {
			// lancer le panel load
		}
		else if (action.equals("LeaderBoard")) {
			// lancer le panel leaderboard
		}
		else if (action.equals("Exit")) {
			System.exit(0);
		}

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

	public void panelMenu() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		this.panelMenu.setLayout(gridBagLayout);

		GridBagConstraints gbc_btnPlay = new GridBagConstraints();
		gbc_btnPlay.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlay.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlay.gridx = 5;
		gbc_btnPlay.gridy = 5;
		this.btnPlay.setActionCommand("Play");
		this.panelMenu.add(this.btnPlay, gbc_btnPlay);
		this.btnPlay.addActionListener(this);

		GridBagConstraints gbc_btnLoad = new GridBagConstraints();
		gbc_btnLoad.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLoad.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoad.gridx = 5;
		gbc_btnLoad.gridy = 6;
		this.btnLoad.setActionCommand("Load");
		this.panelMenu.add(this.btnLoad, gbc_btnLoad);
		this.btnLoad.addActionListener(this);

		GridBagConstraints gbc_btnLeaderBoard = new GridBagConstraints();
		gbc_btnLeaderBoard.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLeaderBoard.insets = new Insets(0, 0, 5, 5);
		gbc_btnLeaderBoard.gridx = 5;
		gbc_btnLeaderBoard.gridy = 7;
		this.btnLeaderBoard.setActionCommand("LeaderBord");
		this.panelMenu.add(this.btnLeaderBoard, gbc_btnLeaderBoard);
		this.btnLeaderBoard.addActionListener(this);

		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 5;
		gbc_btnExit.gridy = 8;
		this.btnExit.setActionCommand("Exit");
		this.panelMenu.add(this.btnExit, gbc_btnExit);
		this.btnExit.addActionListener(this);
	}
}
