


	package com.example;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class views {
		 static Scanner s=new Scanner(System.in);
		 static String url="jdbc:mysql://localhost:3306/sys";
			static  String user="root";
			static String pass="system";
		public static void main(String[] args) throws ClassNotFoundException, SQLException { 
			
			int i=1;
			while (true)
			{
				menu();
				System.out.println("enter your choice");
				int c=s.nextInt();
				switch (c) {
				case 1: System.out.println("insert the value");
				        insert();
				        break;
				case 2 : System.out.println("delete the value ");
		                 delete();
		                   break;
				case 3: System.out.println("display the data");
				
		                view();
		                break;
				case 4: System.out.println("modify the data");
		                 edit();
		                 break;
				
				case 5: System.out.println("stop the program");
				
		                    
		                  break;
				 default :System.out.println("enter valid option");
					 break;       
				}
			}
			
			
		}
		
	private static void edit() {
			// TODO Auto-generated method stub
			
		}

	private static void view() {
			// TODO Auto-generated method stub
			
		}

	private static void delete() throws SQLException, ClassNotFoundException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection(url,user,pass);
		
			// TODO Auto-generated method stub
		
		
			
			
		}

	private static void insert() throws ClassNotFoundException, SQLException 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection(url,user,pass);
		
		 String q="insert into emp values (?,?,?,?)	";
		PreparedStatement ps=c.prepareStatement(q);
	    System.out.println("enter name");
	    String name =s.next();
	    System.out.println("enter phone no");
	    int phone =s.nextInt();
	    System.out.println("enter DOB");
	    int dob=s.nextInt();
	    System.out.println("enter address");
	    String address=s.next(); 
		ps.setString(1, name);
		ps.setInt(2, phone);
		ps.setInt(3, dob);
		ps.setString(4, address);
		 ps.execute();
		 c.close();
		}

	public static void menu()
	{
	System.out.println("******");
	System.out.println("*curd operation *");
	System.out.println("******");
	System.out.println("1.  insert   ");
	System.out.println("2. delete    ");
	System.out.println("3. view  ");
	System.out.println("4. edit       ");
	System.out.println("5. stop the program");

	}	

	}


