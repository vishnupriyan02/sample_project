package j2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class StaticSelectType {

	public static void main(String[] args) {
		try {
			//step1--load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2--create connection
			String dburl="jdbc:mysql://localhost:3306/3eje2?user=root&password=root";
			
			Connection con=DriverManager.getConnection(dburl);
			
			//step3--Create statement
			//issue the query
			String query="select * from student_database where id =1";
			
			Statement st=con.createStatement();
			
			//step4--execute the query
			
			ResultSet rs=st.executeQuery(query);
			if (rs.next()) {
				int id=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				String per=rs.getString(4);
				String dept=rs.getString(5);
				int yop=rs.getInt(6);
				
				System.out.println(id+" "+fname+" "+lname+" "+per+" "+dept+" "+yop);
				
				
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
