package wrapper_Class;

//Java program to illustrate the Concept of Autoboxing and Unboxing
public class autobox_Unbox {
	
	public static void main(String[] args) {
		
//		Autoboxing or boxing (Explicitly)
		int a = 10;
		Integer a1 = new Integer(a);
		System.out.println("value of a: " + a);
		System.out.println("value of a1: " + a1);
		if (a1 instanceof Integer) {
            System.out.println("Autoboxing was performed!");
        }
		
		System.out.println("-----------------------");
		
		char b ='a';
		Character b1 = new Character(b);
		System.out.println("value of b: " + b);
		System.out.println("value of a1: " + b1);
		if (b1 instanceof Character) {
            System.out.println("Autoboxing was performed!");
        }
		
//		unboxing (Implicitly)
		System.out.println("----------------------------------");
		System.out.println("..........Unboxing..........");
		Integer obj = 20;
		int num = obj;
		System.out.println("value of obj beforre unboxing: "+obj);
		System.out.println("value of obj beforre unboxing: "+num);
		
//		performing addition to check unboxing is performed or not
		int add = obj+6;
		System.out.println("performed addition for int primitive data type after unboxing: "+add);	
	}
}
