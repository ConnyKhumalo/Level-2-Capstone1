import java.io.IOException;
import java .io.FileWriter;
import java.util.Scanner;

public class ProjectOverview {

	public static void main(String[] args) {
		System.out.println("Please choose from the menu, Enter A, B,C or \nMenu: \nA - Add a project\nB- Edit Project\nE - Exit");
		//getting the users input
		Scanner in = new Scanner(System.in);
		String uinput = in.nextLine();
		//Verify that menu choice is valid
		if(!uinput.equals("A") && !uinput.equals("B") && !uinput.equals("C") &&  !uinput.equals("E")) {
			System.out.println("Your menu choice is invalid.");
		} else {
			if (uinput.equals("A")) {//User chooses Add a project
				System.out.println("Please enter the ERF Number: ");
				String ERF_number = in.nextLine();
				System.out.println("Please enter the project number: ");
				String project_number = in.nextLine();
				System.out.println("Please enter the project name: ");
				String project_name = in.nextLine();
				System.out.println("Please enter the customer name: ");
				String customer_name = in.nextLine();
				System.out.println("Please enter the customer surname: ");
				String customer_surname = in.nextLine();
				if(project_name == "") {
					String	project_name1 = customer_name + customer_surname;
				}
				System.out.println("Please enter the building type: ");
				String building_type = in.nextLine();
				System.out.println("Please enter the physical address: ");
				String physical_address = in.nextLine();
				System.out.println("Please enter the current date  in this format YYYY-MM-DD: ");
				String date = in.nextLine();
				System.out.println("Please enter the project deadline in this format YYYY-MM-DD: ");
				String deadline = in.nextLine();
				Project pObject = new Project(ERF_number,project_number,project_name,customer_name,customer_surname, deadline, deadline, deadline);
				System.out.println("Details of the project");
				System.out.println(pObject);
				//Checking if project is over due
				//if(date deadline)) {
				//System.out.println("Project is overdue");
				//}
				//System.out.println("Project marked as finalised. ");

				try {
					FileWriter myWriter = new FileWriter("CompletedProject.txt");
					myWriter.write(""); 
					myWriter.close();
					System.out.println("File ready ");

				} catch(IOException e) {
					System.out.println("An error occured");
					e.printStackTrace();
				}
				System.out.println("Project has been added");
				//Invoice details
				System.out.println("Please enter the customer telephone number: ");
				String contact_details = in.nextLine();
				System.out.println("Please enter the customer name: ");
				//String customer_name = in.nextLine();
				System.out.println(customer_name);
				System.out.println("Please enter the customer surname: ");
				//String customer_surname = in.nextLine();
				System.out.println(customer_surname);
				System.out.println("Please enter the total fee: ");
				double total_fee = in.nextDouble();
				System.out.println("Please enter the total amount paid: ");
				double total_paid = in.nextDouble();
				double balance = total_fee - total_paid;
				if (balance == 0) {
					System.out.println("Your balance is 0 ,therefore you wont be recieving an invoice");
				}
				System.out.println("Invoice");
				Invoice iObject = new Invoice(contact_details,customer_name,customer_surname, balance,total_fee,total_paid);
				System.out.println(iObject);

				System.out.println("Your project has been added");

				//Architect info
				System.out.println("Please enter the name of the architect: ");
				String name = in.nextLine();
				System.out.println("Please enter the telephone number of the architect: ");
				long telephone1 = in.nextLong();
				System.out.println("Please enter the email address of the architect: ");
				String email_address = in.nextLine();
				System.out.println("Please enter the physical address of the architect: ");
				String aphysical_address = in.next();//Architect physical address
				Architect arObject = new Architect(name,telephone1,email_address,aphysical_address);
				System.out.println(arObject);

				//Contractors info
				System.out.println("Please enter the name of the contractor: ");
				String cname = in.nextLine();
				System.out.println("Please enter the telephone number of the contractor: ");
				long ctelephone = in.nextLong();
				System.out.println("Please enter the email address of the contractor: ");
				String cemail_address = in.nextLine();
				System.out.println("Please enter the physical address of the contractor: ");
				String cphysical_address = in.next();
				Contractor cObject = new Contractor(cname,ctelephone,cemail_address,cphysical_address);
				System.out.println(cObject);
				//Still have to write and open a txt

				
			}if(uinput.equals("B"))	{//Making changes to a specific project number
				System.out.println("Please enter the  project  number you would like to edit");
				String project_number = in.nextLine();
				System.out.println("Please enter what you would like to edit in the project: \nEnter \nD- Due date\nT - total amount");
				Scanner sc = new Scanner(System.in);
				String uinput2 = sc.nextLine();
				if(uinput2.equals("D")) {
					System.out.println("Please enter the new deadline: ");
					String deadline2 = sc.nextLine();
					System.out.println("New deadline has been added.");
		

				} else {
					if(uinput2.equals("T")) {
						System.out.println("Please enter the new total amount: ");
						double total_amount2 = sc.nextDouble();
						System.out.println("New total amount has been added.");
						
					}
				}
			}
			if(uinput.equals("E")) {

			}	
		}	
	}
}
