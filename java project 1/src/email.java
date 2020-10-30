import java.util.Scanner;


public class email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private String Email;
	private String alternateEmail;
	private String companyName="matsys.com";
	
	// Constructor for create mail
	
public email (String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Mail created : "+ this.firstName+" "+ this.lastName);
		
		this.department= setDepartment();
		System.out.println("Welcome to "+ this.department+"  department");
		
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your password is -"+ this.password);
		
		Email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName;
		  System.out.print("Your email id is-"+Email);
	}
	
	// method for department
	 private String setDepartment()
	 {
		 System.out.print("DEPARTMENT CODE : \n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code: ");
		Scanner sc= new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice==1) {return "sales";}
		else if (depChoice==2) {return "development";}
		else if (depChoice==3) {return "accounting";}
		else {return " ";} 
	 }
	 
	 // method for password
	  private String randomPassword(int length)
	  {
		  String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";
		char[] password = new char[length];
		  for(int i=0;i<length;i++)
		  {
			  int rand= (int)(Math.random() * passwordSet.length());
			  password[i]=passwordSet.charAt(rand);
		  }
		  return new String(password);
	  }

	  


public static void main(String[] args)
{
	email em1 = new email("matru","sahu");
}
}


