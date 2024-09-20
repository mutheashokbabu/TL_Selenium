package homeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
		int j = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != j) {
				System.out.println("Missing number is " + j);
				break;
			}
			j = j + 1;

		}
	}

}
