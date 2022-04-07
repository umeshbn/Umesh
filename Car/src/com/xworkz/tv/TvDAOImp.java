package com.xworkz.tv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TvDAOImp implements TvDAO{

	@Override
	public void addData(TvEntity entity) {
		System.out.println("addData invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/televisiondb", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("insert into televisiondb.tv values(?,?,?,?);");
				prepareStatement.setInt(1, entity.getTvId());
				prepareStatement.setString(2, entity.getTvColor());
				prepareStatement.setDouble(3, entity.getTvPrice());
				prepareStatement.setString(4, entity.getTvBrand());
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
	public void updateData(TvEntity entity) {
		System.out.println("update invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/televisiondb", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("update televisiondb.tv set tvColor=?,tvPrice=?, tvBrand=? where tvId=?;");

				prepareStatement.setString(1, entity.getTvColor());
				prepareStatement.setDouble(2, entity.getTvPrice());
				prepareStatement.setString(3, entity.getTvBrand());
				prepareStatement.setInt(4, entity.getTvId());
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
	public void deleteData(int tvId) {
		System.out.println("delete method is  invoked.....");
		Connection connection = null;
		try {
			System.out.println("try block is started......");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/televisiondb", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection
						.prepareStatement("delete from televisiondb.tv where tvId=?;");
				prepareStatement.setInt(1, tvId);
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
		String query = "SELECT * FROM televisiondb.tv;";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/televisiondb", "root", "root");
			if (connection != null) {
				PreparedStatement prepareStatement = connection.prepareStatement(query);
				ResultSet resultSet = prepareStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("tvId"));
					System.out.println(resultSet.getString("tvColor"));
					System.out.println(resultSet.getDouble("tvPrice"));
					System.out.println(resultSet.getString("tvBrand"));

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
