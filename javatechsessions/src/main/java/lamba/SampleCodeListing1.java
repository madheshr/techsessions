package lamba;

public class SampleCodeListing1
{
	public static void method1(String... args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello world.. without using Lambdas!");
			}
		};
		r.run();
	}

	public static void method2(String... args) {
	    Runnable r2 = () -> System.out.println("Cool Hello world with lambda!");
	    r2.run();
	  } 	

	public static void main(String args[]) {
		method1(args);
		method2(args);


	}

}
