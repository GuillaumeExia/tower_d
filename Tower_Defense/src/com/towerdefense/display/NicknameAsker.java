package com.towerdefense.display;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.towerdefense.towerdefense.GlobalVariables;
import com.towerdefense.towerdefense.Map;
import com.towerdefense.towerdefense.database.DataBase;

public class NicknameAsker extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;

	private static JTextField nickname;

	public static JTextField getNickname() {
		return nickname;
	}

	private JLabel enterNickname;
	private JLabel chooseMap;

	private DataBase database = new DataBase();

	public JOptionPane optionPaneVerif;

	private JButton validButton = new JButton("Ok");

	ArrayList<Map> allMaps;
	JComboBox<String> mapList;

	public NicknameAsker() {
		this.setSize(150, 150);
		setTitle("Nickname");
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(new FlowLayout());

		enterNickname = new JLabel();
		enterNickname.setText("Enter your nickname");
		this.add(enterNickname);

		nickname = new JTextField();
		nickname.setColumns(10);
		this.add(nickname);

		chooseMap = new JLabel();
		chooseMap.setText("Choose a map");
		this.add(chooseMap);

		mapList = new JComboBox();
		allMaps = database.selectAllMapsProc();
		for (Map map : allMaps) {
			mapList.addItem(map.getName());
		}
		this.add(mapList);

		validButton.setActionCommand("Ok");
		this.add(validButton);
		validButton.addActionListener(this);
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionString = e.getActionCommand();
		if (actionString.equals("Ok")) {
			if (NicknameAsker.getNickname().getText().equals("")) {
				optionPaneVerif = new JOptionPane();
				optionPaneVerif.showMessageDialog(this,
						"Veuillez rentrer un pseudo!", "Erreur",
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (Map map : allMaps) {
					if (mapList.getSelectedItem().equals(map.getName())) {
						GlobalVariables.selectedMap = map;
					}
				}
				GlobalVariables.nickname = nickname.getText();
				Window.changePanel("panelGame");
				setVisible(false);
			}
		}
	}

}
