package com.xworkz.tv;

public interface TvDAO {
		
	  public void addData(TvEntity entity);
	  public void updateData(TvEntity entity);
	  public void deleteData(int tvId);
	  public void getData();
}
