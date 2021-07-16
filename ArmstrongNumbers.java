package assignment1;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int n = 153;

		int calculated = 0;
		int remainder=0;
		int original=0;
	
		while (n > 0) {
			remainder = n % 10;
			calculated = remainder * remainder * remainder;
			n = n / 10;

		}

		if (calculated == original) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}

	}

}
