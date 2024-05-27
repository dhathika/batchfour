package com.vidvaan.bus.util;

import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Properties properties = null;
	private static Connection connection = null;
	static {
		properties = new Properties();
		try {
			properties.load(
					ConnectionUtil.class.getClassLoader().getResourceAsStream("com/vidvaan/bus/properties/db.properties"));
			Class.forName(properties.getProperty("DB_Driver_Class"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(properties.getProperty("DB_URL"),
					properties.getProperty("DB_Username"), properties.getProperty("DB_Password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}

	public static void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection connection, PreparedStatement preparedStatement) {
		close(connection);
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
		close(connection, preparedStatement);
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
