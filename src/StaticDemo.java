/**
 * 
 */

/**
 * @Create A class
 *
 */

public class StaticDemo {

	static {
		/** @Output */
		System.out.println("Hello i will execute first");
	}

	/** @Method Declaration */
	void show() {
		/** @Output */
		System.out.println("I am a metohod ");
	}

	public static void main(String[] args) {
		StaticDemo obj = new StaticDemo();
		obj.show();

	}

}