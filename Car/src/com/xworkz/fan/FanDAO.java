package com.xworkz.fan;

public interface FanDAO {

	public void saveData(FanEntity fanEntity);
	public void upadate(String type,int fanId);
	public void delete(int fanId);
	public void getData();
}
