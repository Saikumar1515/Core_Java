package Threads;

public class CountExample extends Thread {
					
		public static void main(String[] args) {
			
			System.out.println("Main Starts");
			
			LearnDataInconsistency d = new LearnDataInconsistency();
			
			Thread t = new Thread(()->{
				for(int i = 1; i<= 1000; i++) {
					d.increment();
				}
			});
//			t.start();
			
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			created another thread
			Thread t1 = new Thread(()->{
				for(int i = 1; i<= 1000; i++) {
					d.increment();
				}
			});
			t.start();
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("The final count is: "+d.getCount());
			
			System.out.println("main ends........");
		}
}