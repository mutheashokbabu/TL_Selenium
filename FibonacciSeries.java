package homeAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int firstNum=0, secondNum=1;
		System.out.print("Fibonacci Series for " +n + " is ");
		
		for (int i=1; i<=n; i++) {
			System.out.print(firstNum + ", ");
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}

}
