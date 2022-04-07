import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void getMobileData() {
		System.out.println("invoked getMobileData()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select * from mobiledatabase.mobile where mobileId=1;");
				resultSet.next();
				System.out.println(resultSet.getInt("mobileId"));
				System.out.println(resultSet.getString("mobileBrand"));
				System.out.println(resultSet.getInt("mobileRam"));
				System.out.println(resultSet.getDouble("mobilePrice"));
				System.out.println(resultSet.getString("mobileModel"));
				System.out.println(resultSet.getString("mobileColor"));
				System.out.println(resultSet.getString("mobileType"));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getAllMobileData() {
		System.out.println("invoked getAllMobileData()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement.executeQuery("select * from mobiledatabase.mobile;");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("mobileId"));
					System.out.println(resultSet.getString("mobileBrand"));
					System.out.println(resultSet.getInt("mobileRam"));
					System.out.println(resultSet.getDouble("mobilePrice"));
					System.out.println(resultSet.getString("mobileModel"));
					System.out.println(resultSet.getString("mobileColor"));
					System.out.println(resultSet.getString("mobileType"));
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobilePriceByID() {
		System.out.println("invoked getMobilePriceByID......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobilePrice from  mobiledatabase.mobile where mobileId=1;");
				resultSet.next();
				System.out.println("MOBILEPRICE=" + resultSet.getDouble("mobilePrice"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileModelById() {
		System.out.println("invoking getMobileModelById()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileModel from  mobiledatabase.mobile where mobileId=1;");
				resultSet.next();
				System.out.println("MOBILEMODEL=" + resultSet.getString("mobileModel"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobilMobileColorById() {
		System.out.println("invoikng  getMobilMobileColorById()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileColor from  mobiledatabase.mobile where mobileId=6;");
				resultSet.next();
				System.out.println("MOBILECOLOR=" + resultSet.getString("mobileColor"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileRamById() {
		System.out.println("invoking getMobileRamById()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileRam from  mobiledatabase.mobile where mobileId=2;");
				resultSet.next();
				System.out.println("MOBILERAM=" + resultSet.getInt("mobileRam"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileBrandlById() {
		System.out.println("invoing getMobileBrandlById()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileBrand from  mobiledatabase.mobile where mobileId=4;");
				resultSet.next();
				System.out.println("MOBILEBRAND=" + resultSet.getString("mobileBrand"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileTypeById() {
		System.out.println("invoking getMobileModelById()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileType from  mobiledatabase.mobile where mobileId=8;");
				resultSet.next();
				System.out.println("MOBILETYPE=" + resultSet.getString("mobileType"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMaxMobilePrice() {
		System.out.println("invoking getMaxMobilePrice()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select max(mobilePrice) from mobiledatabase.mobile;");
				resultSet.next();
				System.out.println("MAXPRICE=" + resultSet.getDouble("max(mobilePrice)"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMinMobilePrice() {
		System.out.println("invoking getMinMobilePrice()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select min(mobilePrice) from mobiledatabase.mobile;");
				resultSet.next();
				System.out.println("MINPRICE=" + resultSet.getDouble("min(mobilePrice)"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileCount() {
		System.out.println("invoking getMobileCount() ......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement.executeQuery("select count(*) from mobiledatabase.mobile ;");
				resultSet.next();
				System.out.println("MOBILECOUNT=" + resultSet.getInt("count(*)"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileColorByBrand() {
		System.out.println("invoked ggetMobileColorByBrand()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileColor from  mobiledatabase.mobile where mobileBrand='realme';");
				resultSet.next();
				System.out.println("MOBILECOLOR=" + resultSet.getString("mobileColor"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobilePriceByBrand() {
		System.out.println("invoked getMobilePriceByID......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobilePrice from  mobiledatabase.mobile where mobileBrand='realme';");
				resultSet.next();
				System.out.println("MOBILEPRICE=" + resultSet.getDouble("mobilePrice"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileTypeByPrice() {
		System.out.println("invoked getMobileTypeByPrice()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileType from  mobiledatabase.mobile where mobilePrice=55000;");
				resultSet.next();
				System.out.println("mobileType=" + resultSet.getString("mobileType"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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

	@Override
	public void getMobileModelByColor() {
		System.out.println("invoked getMobileModelByColor()......");
		Connection connection = null;
		try {
			System.out.println("try block is executing.....");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledatabase", "root", "root");
			if (connection != null) {
				Statement createStatement = connection.createStatement();
				ResultSet resultSet = createStatement
						.executeQuery("select mobileModel from  mobiledatabase.mobile where mobileColor='maroon';");
				resultSet.next();
				System.out.println("mobileModel=" + resultSet.getString("mobileModel"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
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
