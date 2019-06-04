import java.util.*;

public class applicationEmployee {
	static class empDetails {
		String name, email;
		int empId, phone;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sel;
		int arrayCount = 0;
		System.out.println("Hello!");
		boolean lc = true;
		while (lc == true) {
			System.out.println(arrayCount);
			System.out.println("Please Select an Option from below :");
			System.out.println("1. Enter Details of new Employee.");
			System.out.println("2. Update Details of an Employee.");
			System.out.println("3. Search Details of an Employee.");
			System.out.println("4. List the Details of all Employees.");
			System.out.println("5. Exit Application.");
			sel = input.nextInt();
			empDetails[] emp = new empDetails[50];
			emp[arrayCount] = new empDetails();
			switch (sel) {

			case 1:
				boolean running = true;
				emp[arrayCount] = new empDetails();
				while (running) {
					emp[arrayCount] = new empDetails();
					System.out.println("Please Enter The Details :");
					System.out.println("Employee Name : ");
					emp[arrayCount].name = input.next();
					System.out.println("Employee Email :");
					emp[arrayCount].email = input.next();

					System.out.println("Employee ID :");
					emp[arrayCount].empId = input.nextInt();
					System.out.println("Employee Phone No.");
					emp[arrayCount].phone = input.nextInt();
					System.out.println("Employee Succesfully Added");
					arrayCount++;
					System.out.println(arrayCount);
					System.out.println("Do you want to Continue?(Y/N)");
					String cont = input.next();

					
					switch (cont) {
					case "y":
						running = true;
						break;
					case "n":
						running = false;
						break;
					default:
						System.out.println("wrong choice");
						break;
					}

				}

				break;
			case 2:
				System.out.println("Enter The Name of employee which you wish to update:");
				String temp1 = input.next();
				for (int i = 0; i <= arrayCount; i++) {
					if (emp[i].name == temp1) {
						System.out.println("Employee Found!");
						System.out.println("Name : " + emp[i].name + "\nEmail : " + emp[i].email + "\nE.ID : "
								+ emp[i].empId + "\nPhone : " + emp[i].phone);
						System.out.println("Please Enter New Details :");
						System.out.println("Employee Name : ");
						emp[i].name = input.next();
						System.out.println("Employee Email :");
						emp[i].email = input.next();
						System.out.println("Employee ID :");
						emp[i].empId = input.nextInt();
						System.out.println("Employee Phone No.");
						emp[i].phone = input.nextInt();
						System.out.println("Employee Succesfully Updated.");
					} else
						System.out.println("No Employee Found!");
				}
				break;
			case 3:
				System.out.println("Enter the name of employee to search");
				String temp2 = input.next();
				for (int i = 0; i <= arrayCount; i++) {
					if (temp2.equals(emp[i].name)) {
						System.out.println("Employee Found!");
						System.out.println("Name : " + emp[i].name + "\nEmail : " + emp[i].email + "\nE.ID : "
								+ emp[i].empId + "\nPhone : " + emp[i].phone);
					} else
						System.out.println("No Employee Found!");
				}
				break;
			case 4:
				System.out.println("Listing all employees");
				for (int i = 0; i<arrayCount; i++) {

					System.out.println("Name : " + emp[i].name.toString() + "\nEmail : " + emp[i].email.toString() + "\nE.ID : "
							+ emp[i].empId + "\nPhone : " + emp[i].phone);
				}
				break;
			case 5:
				System.out.println("Are you sure you want to exit?(Y/N)");
				String cond = input.next();
				switch (cond) {
				case "y":
					System.out.println("Exiting...");
					lc = false;
					break;
				case "n":
					System.out.println("OKay!");
					break;
				default:
					System.out.println("wrong choice");
				}
			}

		}

	}

}
