package com.towerdefense.display;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NicknameAsker extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;

	private static JTextField nickname;

	public static JTextField getNickname() {
		return nickname;
	}

	public JOptionPane optionPaneVerif;

	private JButton validButton = new JButton("Ok");

	public NicknameAsker() {
		this.setSize(100, 100);
		this.setTitle("Nickname");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new FlowLayout());
		nickname = new JTextField();
		nickname.setColumns(10);
		this.add(nickname);
		this.validButton.setActionCommand("Ok");
		this.add(this.validButton);
		this.validButton.addActionListener(this);
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionString = e.getActionCommand();
		if (actionString.equals("Ok")) {
			if (NicknameAsker.getNickname().getText().equals("")) {
				this.optionPaneVerif = new JOptionPane();
				this.optionPaneVerif.showMessageDialog(this, "Veuillez rentrer un pseudo!", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else {
				System.out.println(NicknameAsker.getNickname().getText());
				this.setVisible(false);
			}
		}
	}

}
