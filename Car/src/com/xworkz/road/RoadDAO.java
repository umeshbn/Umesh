package com.xworkz.road;

public interface RoadDAO {
	
	public void createData(RoadEntity Entity);
	public void updateData(RoadEntity Entity);
	public void deleteData(int roadId);
	public void getData();
}
