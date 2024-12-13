package Thread_Locks;

public class DeadLocks {

	public static void main(String[] args) {
		
		Thread t = new Thread(()-> {
			System.out.println("Thread 1 locks resource 1");
		});
		try {
			t.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.start();
		
		Thread t2 = new Thread(()->{
			System.out.println("Thread 2 locks resource 2");
			
		});
		try {
			t2.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}
}

class Resource{
	synchronized static void resource1() 
	{
		System.out.println("resource 2");
		resource1();
		Resource2.resource2();
		System.out.println("resoure 2 executed");
	}
}

class Resource2{
	synchronized static void resource2() {
		System.out.println("resoure 1");
		resource2();
		Resource.resource1();
		System.out.println("resoure 1 executed");
	}
}

