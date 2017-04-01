
/**
 * 
 * @Create a Class
 */
public class ConstructorChaining {
	/** @Main method */
	public static void main(String args[]) {
		new Derived("Test");
	}
}

/** @Creating a class */
class Base {
	/** @Variable declare */
	protected String name;

	/** @Constructor creating */
	public Base() {
		/** @Calling one argument constructor of same class. */
		this("");
		/** @Output */
		System.out.println("Inside no argument constructor of Base class.");
	}

	/** @Creating a class */
	public Base(String name) {
		this.name = name;
		System.out.println("One arg constructor of Base class.");
	}
}

/** @Derived class */
class Derived extends Base {
	/** @Constructor creating */
	public Derived() {
		System.err.println("Inside no argument constructor of Derived class.");
	}

	public Derived(String name) {
		/** @Calling one argument constructor of super class. */
		super(name);
		/** @Output */
		System.out.println("Inside one arg constructor from Derived class.");
	}

}