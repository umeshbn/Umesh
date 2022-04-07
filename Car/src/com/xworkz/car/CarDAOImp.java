package com.xworkz.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarDAOImp implements CarDAO {

	public void getCarData() {
		System.out.println("get method is invoked");
		Connection connection = null;

		try {
			
				System.out.println("try block started");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb", "root", "root");
				if (connection != null) {
				System.out.println(connection.hashCode());
				Statement createStatement = connection.createStatement();
				ResultSet executeQuery = createStatement.executeQuery("select * from Cardb.car where carId=1");
				executeQuery.next();
				System.out.println(executeQuery.getInt("carId"));
				System.out.println(executeQuery.getString("carName"));
				System.out.println(executeQuery.getInt("carPrice"));
				System.out.println(executeQuery.getString("carModel"));

			}
		} catch (Exception exception) {
			System.out.println(exception);

		} finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("conncetion is closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void updateCarData(String carName, String carModel, int carId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCarData(int carId) {
		// TODO Auto-generated method stub
		
	}

}
