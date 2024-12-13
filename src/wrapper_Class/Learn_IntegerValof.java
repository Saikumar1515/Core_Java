package wrapper_Class;

import java.util.Scanner;

public class Learn_IntegerValof {
	
	public Learn_IntegerValof(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		
		String input = sc.nextLine();
		try {
			 // Convert the input string to an Integer using valueOf()
//				Integer age = Integer.valueOf(input);
			Integer age = new Integer(input);
			int currentyear = 2024;
				if(age<0) {
					System.out.println("age cannot be negative..");
				} else {
					System.out.println("your age is: "+age);
					
					int yearOfBirth = currentyear-age;
					System.out.println("You were born in: "+yearOfBirth);
				}		
		} 
	catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid input. Please enter a valid number.");
		}
		
//		Caching in wrapper class
		
//		This code shows how "new" forces a new object to be created. The second one reuses the same object. (This only 		happens for Integer values up to a certain number. If you had Integer.valueOf("45648641"), they wouldn't be 		 		the same object.
		
		System.out.println(new Learn_IntegerValof("4") == new Learn_IntegerValof("4")); //false
		System.out.println(Integer.valueOf("4") == Integer.valueOf("4")); // true
	}
}
