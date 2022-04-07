package com.xworkz.fan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FanDAOImp implements FanDAO {

	@Override
	public void saveData(FanEntity fanEntity) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fandb", "root", "root");
			if (connection != null) {
				// System.out.println(connection.hashCode());
				Statement createStatement = connection.createStatement();
				int noOfRowsAffected = createStatement
						.executeUpdate("insert into fandb.fan values(7,'uma',455,'standfan');");
				System.out.println(fanEntity.getFanId());
				System.out.println(fanEntity.getBrand());
				System.out.println(fanEntity.getPrice());
				System.out.println(fanEntity.getType());
				System.out.println(noOfRowsAffected);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					System.out.println("try block executing....");
					connection.close();

				} catch (SQLException e) {
					System.out.println(e);
				}
				System.out.println("connection is  sucessfull");
			} else {
				System.out.println("connection is not sucessfull");
			}
		}

	}

	@Override
	public void upadate(String type, int fanId) {
		System.out.println("update method is invoked..");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fandb", "root", "root");
			if (connection != null) {
				System.out.println(connection.hashCode());
				PreparedStatement prepareStatement = connection
						.prepareStatement("update fandb.fan set type=? where fanId=?;");
				prepareStatement.setString(1, type);
				prepareStatement.setInt(2, fanId);
				System.out.println(prepareStatement);
				prepareStatement.executeUpdate();
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					System.out.println("try block executing....");
					connection.close();

				} catch (SQLException e) {
					System.out.println(e);
				}
				System.out.println("connection is  sucessfull");
			} else {
				System.out.println("connection is not sucessfull");
			}
		}
	}

	@Override
	public void delete(int fanId) {
		System.out.println("delete method is invoked.......");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fandb", "root", "root");
			if (connection != null) {

				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from fandb.fan where fanId=?;");
				prepareStatement.setInt(1, fanId);
				prepareStatement.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					System.out.println("try block.....");
					connection.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("connection is generated");
			} else {
				System.out.println("connection is not generated");
			}
		}
	}

	@Override
	public void getData() {
		System.out.println("getdata method is invoked..........");
		String query = "SELECT * FROM fandb.fan;";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fandb", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection.prepareStatement(query);
				ResultSet resultSet = prepareStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("fanId"));
					System.out.println(resultSet.getString("brand"));
					System.out.println(resultSet.getInt("price"));
					System.out.println(resultSet.getString("type"));
					
				}
				resultSet.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (connection != null) {
				try {
					System.out.println("try block.....");
					connection.close();
				} catch (Exception e) {
					System.out.println(e);
					
				}
				System.out.println("connection is generated");
			} else {
				System.out.println("connection is not generated");
			}
		}

	}

}
