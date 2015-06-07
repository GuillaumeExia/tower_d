package com.towerdefense.towerdefense.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.towerdefense.towerdefense.Map;
import com.towerdefense.towerdefense.objects.Grass;
import com.towerdefense.towerdefense.objects.Ground;
import com.towerdefense.towerdefense.objects.Path;
import com.towerdefense.towerdefense.objects.Spawnpoint;

class DBLink {

	private String url = "jdbc:mysql://164.138.29.106/tower_defense";
	private String user = "guillaume";
	private String password = "z4B725b8SW";
	private Connection connection = null;
	private Statement statement = null;
	ResultSet resultSet = null;

	public DBLink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void close() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public java.sql.ResultSet executeQuery(String query) {

		try {
			return statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Connection getConnection() {
		return connection;
	}

	public ArrayList<Ground> mapSelection(int id) {
		open();
		ArrayList<Ground> groundList = new ArrayList();
		try {
			CallableStatement cs = connection.prepareCall(DBProcedure
					.loadTerrain());
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				switch (rs.getInt("TYPE")) {
				case 1:
					groundList.add(new Grass(rs.getInt("X"), rs.getInt("Y")));
					break;
				case 2:
					groundList.add(new Path(rs.getInt("X"), rs.getInt("Y")));
					break;
				case 3:
					groundList.add(new Spawnpoint(rs.getInt("X"), rs
							.getInt("Y")));
					break;
				// case 4 : new Workstation
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return groundList;
	}

	public boolean open() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, password);
				statement = connection.createStatement();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		System.out.println("Connection successfull");
		return true;
	}

	public ArrayList<Map> selectAllMapsProc() {
		open();
		ArrayList<Map> mapList = new ArrayList();
		try {
			CallableStatement cs = connection.prepareCall(DBProcedure
					.selectAllMaps());
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				mapList.add(new Map(rs.getString("NAME"), rs.getInt("WIDTH"),
						rs.getInt("HEIGHT"), rs.getInt("ID_MAP")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return mapList;
	}

}
