package com.xworkz.car;

import java.sql.SQLException;
import java.util.Scanner;

public class CarTester {

	public static void main(String[] args) throws SQLException {

		CarDAOImp carDAOImp = new CarDAOImp();
		
		carDAOImp.getCarData();
		// carDAOImp.updateCarData( carName, carModel,carId);
		//carDAOImp.deleteCarData(carId);
	}
}
