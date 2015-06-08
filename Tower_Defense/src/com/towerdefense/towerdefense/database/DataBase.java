package com.towerdefense.towerdefense.database;

import java.util.ArrayList;

import com.towerdefense.towerdefense.Map;
import com.towerdefense.towerdefense.objects.Ground;

public class DataBase {
	private DBLink database;

	public DataBase() {
		//super();
		database = new DBLink();
		database.open();
		System.out.println("Connection Successfull");
		//database.close();
	}

	public Map loadMap(int id) {
		return null;
	}

	public Map loadSave(int id) {
		return null;
	}

	public ArrayList<Ground> mapSelection(int id) {
		return database.mapSelection(id);
	}

	public void save(Map map) {
		return;
	}

	public ArrayList<Map> selectAllMapsProc() {
		return database.selectAllMapsProc();
	}
}
