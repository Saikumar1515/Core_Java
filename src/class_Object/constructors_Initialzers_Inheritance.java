package class_Object;

public class constructors_Initialzers_Inheritance {
	
	public static void main(String[] args) {
		System.out.println("Creating Child object:");
		new child();
	}
}

class Parent{
	
	static {
		System.out.println("Static initializer of Parent");
	}
	
	{
		System.out.println("instance initializer of Parent");
	}
	public Parent() {
		System.out.println("Parent class Constructor");
	}
}

class child extends Parent{
	
	static {
		System.out.println("Static initializer of child");
	}
	
	{
		System.out.println("instance initializer of child");
	}
	public child() {
		System.out.println("child class Constructor");
	}
}


/*

Constructors are not inherited by subclasses:

constructors are specific to their class and are not inherited by subclasses.
However, when you create an object of a subclass, the constructor of the superclass is automatically called first (via an implicit or explicit super() call) to initialize the superclass part of the object.
If the superclass does not have a no-argument constructor, the subclass must explicitly call a superclass constructor using super(arguments).


Static initializers and instance initializers are not inherited but executed:

Static initializers (static { }) are executed once when the class is loaded into memory, and they are associated with the class itself, not instances. They are not inherited but are executed when the subclass is loaded if the subclass references the superclass.

Instance initializers ({ }) are executed as part of instance creation. Like constructors, they are not inherited but are executed before the constructor when creating an object of a subclass.
*/


