package com.xworkz.road;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoadDAOImp implements RoadDAO {

	@Override
	public void createData(RoadEntity Entity) {
		System.out.println("createData invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/roadbd", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("insert into roadbd.new_table values(?,?,?,?);");
				prepareStatement.setInt(1, Entity.getRoadId());
				prepareStatement.setString(2, Entity.getType());
				prepareStatement.setString(3, Entity.getName());
				prepareStatement.setInt(4, Entity.getServices());
				prepareStatement.executeUpdate();
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
	public void updateData(RoadEntity Entity) {
		System.out.println("update invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/roadbd", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("update roadbd.new_table set type=?,name=?, services=? where roadId=? ;");

				prepareStatement.setString(1, Entity.getType());
				prepareStatement.setString(2, Entity.getName());
				prepareStatement.setInt(3, Entity.getServices());
				prepareStatement.setInt(4, Entity.getRoadId());
				prepareStatement.executeUpdate();
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
	public void deleteData(int roadId) {
		System.out.println("delete method is  invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/roadbd", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from roadbd.new_table where roadId=?;");
				prepareStatement.setInt(1, roadId);
				// prepareStatement.setString(1,Entity.getType() );
				// prepareStatement.setString(2, Entity.getName());
				// prepareStatement.setInt(3, Entity.getServices());
				// prepareStatement.setInt(4, Entity.getRoadId());
				prepareStatement.executeUpdate();
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
	public void getData() {
		System.out.println("getdata method is invoked..........");
		String query = "SELECT * FROM roadbd.new_table;";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/roadbd", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection.prepareStatement(query);
				ResultSet resultSet = prepareStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("roadId"));
					System.out.println(resultSet.getString("type"));
					System.out.println(resultSet.getString("name"));
					System.out.println(resultSet.getInt("services"));

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
