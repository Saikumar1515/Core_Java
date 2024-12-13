package Threads;

public class Thread_Methods {
	
	public static void main(String[] args) {
		
		System.out.println("main starts....");
		Thread t = new Thread("Thread 1");
		System.out.println(t.getName());
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends....");
	}
}
