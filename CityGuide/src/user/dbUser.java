package user;

import java.util.List;

public class dbUser {
	java.sql.Connection connection = null;
	java.sql.Statement statement = null;
	java.sql.ResultSet result = null;

	public void NewConnection() {
		try {
			String link = "jdbc:mysql://127.0.0.1:3306?&useSSL=false";
			String username = "root";
			String password = "0000";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = java.sql.DriverManager.getConnection(link, username, password);
				statement = connection.createStatement();
			} catch (java.sql.SQLException exception) {
				System.out.println(exception.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void GetSpots(List<Spot> spotlist) {
		Spot spot;
		try {
			result = statement.executeQuery("SELECT * FROM cityguide.data");
			while (result.next()) {
				spot = new Spot();
				spot.SetId(Integer.valueOf(result.getString(1)));
				spot.SetAddress(result.getString(2));
				spot.SetNumber(result.getString(3));
				spot.SetDecription(result.getString(4));
				spot.SetX(Integer.valueOf(result.getString(5)));
				spot.SetY(Integer.valueOf(result.getString(6)));
				spot.SetCategory(result.getString(7));
				spotlist.add(spot);
			}
			result.close();
		} catch (java.sql.SQLException exception) {
			System.out.println(exception.getMessage());
		}
	}

	public void CloseConnection() {
		try {
			if (result != null) {
				result.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (java.sql.SQLException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
