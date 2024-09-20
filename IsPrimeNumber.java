package homeAssignments;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = true;
		for (int i=2; i<number-1; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == false) {
			System.out.println(number + " is non-prime number");
		}
		else {
			System.out.println(number + " is a prime number");
		}
		
	}

}
