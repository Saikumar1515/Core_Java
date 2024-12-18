package class_Object;

//use 1: 1.	This keyword can be used to refer current class instance variable.
//class Test {
//	
//	int i; //instance variable
//	void setValue(int i) 
//	{
//		this.i = i;  //by using this keyword we are referring current class instance variable
//	}
//	void show() {
//		System.out.println(i);
//	}
//}
//
//class learnThisKeywordUsages{
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.setValue(10);  //val 10 will go and store void setValue(int i)  here
//		t.show();
//	}
//}

//instance variable are used for an objects and if we use this keyword it also refers to instance variables.

//public class  learnThisKeywordUsages{
	
	//use 2: This keyword can be used to invoke current class method (implicitly)
//		void display() {
//			System.out.println("Hello!!!!");
//		}
//		void show() {
//			this.display(); // if you don't use this keyword also compiler automatically adds the keyword while invoking the method.
//		}
//		public static void main(String[] args) {
//		ThisKeywordMethodInvoke t = new ThisKeywordMethodInvoke();
//		t.show();		
	//}
		
		
// use 3: This keyword can be used to invoke current class constructors. this is also an example for constructor chaining

//public class  learnThisKeywordUsages{
//		public learnThisKeywordUsages() {
//			this(10);
//			System.out.println("no args constructr");
//		}
//		learnThisKeywordUsages(int a){
//			
//			System.out.println("parameterized constructor");
//		}
//		public static void main(String[] args) {
//			learnThisKeywordUsages m = new learnThisKeywordUsages();		
//	}
//}


//use 4: 4.	This keyword can be used to pass as an argument in the method call.
//public class  learnThisKeywordUsages{
//	
//	void m1(learnThisKeywordUsages u) { //parameter
//		System.out.println("i am in m1 method");
//	}
//	void m2() {
//		m1(this); //this is acting as an argument
//	}
//	public static void main(String[] args) {
//		learnThisKeywordUsages u = new learnThisKeywordUsages();
//		u.m2();	
//	}
//}

//use 5: 5.	This keyword can be used to pass as an argument in the constructor call

//public class  learnThisKeywordUsages {
//	
//	void m1() {
//		Test t = new Test(this);
//	}
//	public static void main(String[] args) {
//		learnThisKeywordUsages l = new learnThisKeywordUsages();
//		l.m1();
//	}	
//}
//
//class Test{
//	Test(learnThisKeywordUsages l){
//		System.out.println("test class constructor");
//	}
//}

//use 6: 6.	This keyword can be used to return the current class instance from the method.
public class  learnThisKeywordUsages {
	
	public learnThisKeywordUsages m1() {
		return this;
	}

	public static void main(String[] args) {
		learnThisKeywordUsages l = new learnThisKeywordUsages();
		l.m1();
		
	}
	
}
