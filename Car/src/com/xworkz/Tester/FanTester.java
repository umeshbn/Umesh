package com.xworkz.Tester;

import java.util.Scanner;

import com.xworkz.fan.FanDAOImp;
import com.xworkz.fan.FanEntity;

public class FanTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FanEntity fanEntity=new FanEntity();
		FanDAOImp fanDAOImp = new FanDAOImp();
		
		
		
		//fanDAOImp.saveData(fanEntity);
		
		//int fanId = scanner.nextInt();
		//String type = scanner.next();
		
		fanDAOImp.getData();
		//fanDAOImp.upadate(type,fanId);
		//fanDAOImp.delete(fanId);
	}

}
