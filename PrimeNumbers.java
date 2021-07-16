package assignment1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int input=13;
		int count=0;

		for (int i = 2; i <=input; i++) {
			if (input % i==0) {
				count=count+1;
			}
			if (count==2) {
				System.out.println(input+ "is prime");
			}
			else {

				System.out.println(input+ "is not prime");

			}

		}
	}}