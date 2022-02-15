package FSS.ui;

	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	public class Workinghours {
	private static float Hours_worked;
	private static float Overtime_hours;
	private static String Month_of_application;
	private static float Allowance_applied;
	private static int Empid;

	
			
			public boolean workingHours() {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");   
	        float hours_worked,overtime_hours,month_of_application,allowance_applied;
	        
			System.out.println("Enter hours_worked:");
			Hours_worked=Float.parseFloat(br.readLine());
			System.out.println("Enter Overtime_hours :");
			Overtime_hours=Float.parseFloat(br.readLine());
			System.out.println("Enter Month_of_application:");
			Month_of_application=br.readLine();
			System.out.println("Enter Allowance_applied :");
			Allowance_applied=Float.parseFloat(br.readLine());
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","abcd");
			
			PreparedStatement stmt=con.prepareStatement("insert into empatendance values(?,?,?,?)");
            //stmt.setInt(1,Empid);
		    stmt.setFloat(1, Hours_worked);
		    stmt.setFloat(2,Overtime_hours);
		    stmt.setString(3,Month_of_application);
		    stmt.setFloat(4, Allowance_applied);
		    
		    int i=stmt.executeUpdate();

		    System.out.println("|--------Employee Attendance Details Recorded Successfully--------|");
			   
		    
			}catch(Exception e) {System.out.println(e);
			}
				return true;
			}
				public static void main (String[] args) throws Exception {
					Workinghours wh=new Workinghours();
					wh.workingHours();
	
	}

			}

