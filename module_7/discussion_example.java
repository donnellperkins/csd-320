// Java program to multiply two numbers

class Example {
	static void mulitply(int a, int b)
	{
		a = a * b;

		System.out.println("\tThe result of a x b is: "
						+ a);
		return;
	}

	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
	
		// print value of a
		System.out.println("The first value is:  "
						+ a);
		
		// print value of b
		System.out.println("The first value is:   "
						+ b);

		// mulitply the numbers
		mulitply(a, b);

		// Reassure user the original variable has not changed
		System.out.println("The first value is still:  " + a);

		System.out.println("The second value is still:  " + b);
	}
}
