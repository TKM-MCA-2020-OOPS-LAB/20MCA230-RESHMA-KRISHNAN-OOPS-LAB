package CO3;
import java.util.*;
public class Employee {
	int Empid;
	String Name;
	float Salary;
	String Address;
	
	public Employee(int id, String name,float salary, String address ) {
		this.Empid = id;
		this.Name = name;
		this.Salary = salary;
		this.Address = address;
		
	}
	
	
static class Teacher extends Employee{
        String Department;
        String Subject;
       
        
                  public Teacher(int id, String name, float salary, String address, String dept, String subj) {
			 super(id, name, salary, address);
			
			
		this.Department = dept;
		this.Subject = subj;
			
			
			// TODO Auto-generated constructor stub
		}


		public void Display() {
			
			System.out.println("\nId: "+Empid);
			System.out.println("Name: "+Name);
			System.out.println("Salary: "+Salary);
			System.out.println("Address: "+Address);
			System.out.println("Department: "+Department);
			System.out.println("Subject: "+Subject);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,count, ID;
		float sal;
		String nam,adr,dep,sub;
		

		System.out.println("Enter the number of records to be stored:");
                                      count = sc.nextInt();
        
                                     Teacher[] e = new Teacher[count];
      
		
		for( i=0; i<count; i++)
			{
			
			   System.out.println("Enter the ID:");
	                                        ID= sc.nextInt();
			   System.out.println("Enter the name:");
			   nam= sc.next();
			   System.out.println("Enter the salary:");
			    sal= sc.nextFloat();
			   System.out.println("Enter the address:");
			   adr= sc.next();
			   System.out.println("Enter the department:");
			   dep= sc.next();
			   System.out.println("Enter the subject:");
			   sub= sc.next();
	        
			   e[i] = new Teacher(ID,nam,sal,adr,dep,sub);
			
			}
		System.out.println("\n______EMPLOYEE DETAILS_____");
		for( i=0; i<count; i++)
	                      {
			e[i].Display();
		    }
		
		
		// TODO Auto-generated method stub
           
	}

}