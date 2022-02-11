package FSS.ui;



	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class DbViewWorkinghours {
	private static int empid;

	
			public boolean hoursWorked() {
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");   
	        float hours_worked = 0,overtime_hours,month_of_application,allowance_applied;
	       // int emp_id = 0;
			System.out.println("Enter Hours_worked :");
			//emp_id=Integer.parseInt(br.readLine());
			hours_worked=Float.parseFloat(br.readLine());
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","abcd");
			
			PreparedStatement stmt=con.prepareStatement("select * from empatendance");

		    
		    
		    
			ResultSet rs = stmt.executeQuery();
			if(rs!= null) {
				System.out.println("   Hours_worked     Overtime_hours    Month_of_application   Allowance_applied");
				System.out.println(  "           8             2                        2020-04-5               1 ");
				
			
			while(rs.next())
				
			System.out.println(rs.getFloat(2)+" "+rs.getFloat(3)+"                 "+rs.getString(4)+"        "+rs.getFloat(5));
			
			
			}
			}catch(Exception e) {System.out.println(e);
			}
			return true;
			}
			public static void main (String[] args) throws Exception {
				DbViewWorkinghours dwh=new DbViewWorkinghours();
				dwh.hoursWorked();
				}
	}
	

