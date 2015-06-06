package com.towerdefense.towerdefense.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBLink {

	private String url = "jdbc:mysql://164.138.29.106/tower_defense";
	private String user = "root";
	private String password = "";
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

	public ResultSet getSave() {
		CallableStatement procedure;
		ResultSet result = null;
		try {
			procedure = connection.prepareCall(DBProcedure.getSave(),
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
			result = procedure.getResultSet();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
		return result;
	}

	public ResultSet getScore() {
		CallableStatement procedure;
		ResultSet result = null;
		try {
			procedure = connection.prepareCall(DBProcedure.getScore(),
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
			result = procedure.getResultSet();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
		return result;
	}

	public ResultSet getTerrain() {
		CallableStatement procedure;
		ResultSet result = null;
		try {
			procedure = connection.prepareCall(DBProcedure.getTerrain(),
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
			result = procedure.getResultSet();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
		return result;
	}

	public boolean open() {
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
		System.out.println("Connection successfull");
		return true;
	}

	public void setSave() {
		CallableStatement procedure;
		try {
			procedure = connection.prepareCall(DBProcedure.setSave());
			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
	}

	public void setScore() {
		CallableStatement procedure;
		try {
			procedure = connection.prepareCall(DBProcedure.setScore());
			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
	}

	public void setTerrain() {
		CallableStatement procedure;
		try {
			procedure = connection.prepareCall(DBProcedure.setTerrain());
			procedure.setString(1, "First parameter of the procedure");
			procedure.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Add valid arguments
	}
}
