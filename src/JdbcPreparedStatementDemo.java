import java.sql.*;
import java.util.*;
public class JdbcPreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement st = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee no");
		int eno = sc.nextInt();
		System.out.println("Enter employee name");
		String ename = sc.next();
		System.out.println("Enter employee salary");
		float salary = sc.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavan","root","root");
			/*st = con.prepareStatement("insert into employee values (?,?,?)");
			st.setInt(1, eno);
			st.setString(2, ename);
			st.setFloat(3, salary);
			st.executeUpdate();
			System.out.println("Inserted");*/
			st = con.prepareStatement("insert into employee values ("+eno+",'"+ename+"',"+salary+")");
			st.executeUpdate();
			System.out.println("Inserted");
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			st.close();
			con.close();
		}
	}

}
