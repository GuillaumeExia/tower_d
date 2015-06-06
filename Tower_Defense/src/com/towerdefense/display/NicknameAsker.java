package com.towerdefense.display;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class NicknameAsker extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField nickname;

	private JButton validButton = new JButton("Ok");

	public NicknameAsker() {
		this.setSize(100, 100);
		this.setTitle("Nickname");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.nickname = new JTextField();
		this.nickname.setColumns(10);
		this.add(this.nickname);
		this.validButton.setActionCommand("Ok");
		this.add(this.validButton);
		this.validButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionString = e.getActionCommand();
		if (actionString.equals("Ok")) {
			System.out.print(this.getNickname().getText());
			this.setVisible(false);
		}
	}

	public JTextField getNickname() {
		return this.nickname;
	}
}
