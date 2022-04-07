package com.xworkz.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Mobile {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mobileId=scanner.nextInt();
		String mobileBrand=scanner.next();
		int mobileRam=scanner.nextInt();
		double mobilePrice=scanner.nextDouble();
		String mobileModel=scanner.next();
		String mobileColor=scanner.next();
		String mobileType=scanner.next();
		
		Mobile.add(mobileId,mobileBrand,mobileRam,  mobilePrice, mobileModel, mobileColor, mobileType);
		
	}
		public static void add(int mobileId,String mobileBrand,int mobileRam,double mobilePrice,String mobileModel,String mobileColor,String mobileType) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into mobiledatabase.mobile values(?,?,?,?,?,?,?);");
			prepareStatement.setInt(1, mobileId);
			prepareStatement.setString(2, mobileBrand);
			prepareStatement.setInt(3, mobileRam);
			prepareStatement.setDouble(4, mobilePrice);
			prepareStatement.setString(5, mobileModel);
			prepareStatement.setString(6, mobileColor);
			prepareStatement.setString(7, mobileType);
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println("noo rows affected"+executeUpdate);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		}
	

}
