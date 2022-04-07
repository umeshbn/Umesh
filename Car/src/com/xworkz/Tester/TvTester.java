package com.xworkz.Tester;

import java.util.Scanner;

import com.xworkz.tv.TvDAO;
import com.xworkz.tv.TvDAOImp;
import com.xworkz.tv.TvEntity;

public class TvTester {
	public static void main(String[] args) {
		  TvEntity tvEntity = new TvEntity();
		
		 TvDAOImp tvDAOImp = new TvDAOImp();
		 Scanner scanner = new Scanner(System.in);
		
		tvEntity.setTvId(scanner.nextInt());
		tvEntity.setTvColor(scanner.next());
		tvEntity.setTvPrice(scanner.nextDouble());
		tvEntity.setTvBrand(scanner.next());
		tvDAOImp.addData(tvEntity);
		//tvDAOImp.updateData(tvEntity);
		
		//int tvId=scanner.nextInt();
		//tvDAOImp.deleteData(tvId);
		//tvDAOImp.getData();
		
	}
}