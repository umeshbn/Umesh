package com.xworkz.car;

public interface CarDAO{

	public void getCarData();

	public void updateCarData( String carName,String carModel,int
	 carId);

	public void deleteCarData(int carId);

	
}
