package com.towerdefense.display;

import com.towerdefense.towerdefense.GlobalVariables;
import com.towerdefense.towerdefense.Map;
import com.towerdefense.towerdefense.database.DBLink;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class NicknameAsker extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;

    private JLabel enterNickname;

    private JLabel chooseMap;

	private static JTextField nickname;

	public static JTextField getNickname() {
		return nickname;
	}

	public JOptionPane optionPaneVerif;

	private JButton validButton = new JButton("Ok");

    ArrayList<Map> allMaps;
    JComboBox<String> mapList;

	public NicknameAsker() {
		this.setSize(150, 150);
		this.setTitle("Nickname");
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new FlowLayout());

        enterNickname = new JLabel();
        enterNickname.setText("Enter your nickname");
        this.add(enterNickname);

        nickname = new JTextField();
		nickname.setColumns(10);
		this.add(nickname);

        chooseMap = new JLabel();
        chooseMap.setText("Choose a map");
        this.add(chooseMap);

        this.mapList = new JComboBox();
        DBLink dbLink = new DBLink();
        allMaps = dbLink.selectAllMapsProc();
        for(Map map : allMaps){mapList.addItem(map.getName());}
        this.add(mapList);

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
                for(Map map : allMaps){
                    if(mapList.getSelectedItem().equals(map.getName())){
                        GlobalVariables.selectedMap = map;
                    }
                }
                GlobalVariables.nickname = nickname.getText();
                Window.changePanel("panelGame");
				this.setVisible(false);
			}
		}
	}

}
