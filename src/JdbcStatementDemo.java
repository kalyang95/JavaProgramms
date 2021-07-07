import java.sql.*;
import java.util.*;
public class JdbcStatementDemo {

	public static void main(String[] args) throws SQLException  {
		Connection con = null;
		Statement st = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavan","root","root");
		con.setAutoCommit(false);
		//System.out.println("Connected");
		st = con.createStatement();
		/*st.execute("create table employee (eno int(3), ename varchar(15), salary float(4))");
		System.out.println("table created");*/
		/*st.executeUpdate("insert into employee values (111,'Pavan',8000)");
		st.executeUpdate("insert into employee values (222,'kalyan',6000)");
		st.executeUpdate("insert into employee values (333,'Ram',7000)");
		System.out.println("Inserted");*/
		/*int n = st.executeUpdate("update employee set salary = 8000");
		System.out.println(n+" records updated");*/
		/*int n = st.executeUpdate("delete from employee");
		System.out.println(n+" records updated");*/
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt("eno")+" "+rs.getString("ename")+" "+rs.getFloat(3));
		}
		con.commit();
		
		}catch(Exception e) {
			con.rollback();
			System.out.println(e);
		}
		finally {
			st.close();
			con.close();
		}
	}

}
