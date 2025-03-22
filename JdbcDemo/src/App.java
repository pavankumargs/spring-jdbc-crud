import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root",
					"Root@123$");

			Statement statement = connection.createStatement();

//			String query = "create table test(id int, test1 varchar(45))";
//			statement.execute(query);

//			int count = statement.executeUpdate("insert into test(id,test1) values(2,'test2')");

			// int count = statement.executeUpdate("delete from test where id = 1");
//			System.out.println("No Of Rows Updated : "+count);

			ResultSet res = statement.executeQuery("select * from test");
			ResultSetMetaData metaData = res.getMetaData();
			
			int columnCount = metaData.getColumnCount();
//			System.out.println(columnCount);
			
//			while(res.next()) {
//				for(int i=0;i<columnCount;i++) {
//					System.out.println(res.getString(i)+" ");
//				}
//			}
			
			
//			normal scenario when you know the how many columns inside the table
//			while(res.next()) {
//				System.out.println(res.getString(1)+"  "+res.getString(2));
//			}

//			if you don't know howmany columns inside the table
//          get column count and use it in for loop
			
			while(res.next()) {
				for(int i=1;i<=columnCount;i++) {
					System.out.print(res.getString(i)+ "  ");
				}
				System.out.println();
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
