package Exception_handling;

import java.util.Scanner;

class customizedCheckedException {

	public customizedCheckedException(double d) {
		// TODO Auto-generated constructor stub
	}
	static void deposit() throws InsufficientBalanceException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount: ");
		int input = sc.nextInt();
		if(input <= 1000) {
			System.out.println("collect your cash");
		} else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}
	public static void main(String[] args) {
		try {
			deposit();
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

class InsufficientBalanceException extends Exception{
	String Message;

	public InsufficientBalanceException(String Message) {
		this.Message = Message;
	}
	public String getMessage() {
		return Message;
	}	
}
