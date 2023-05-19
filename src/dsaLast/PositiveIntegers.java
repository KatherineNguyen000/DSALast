package dsaLast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the value of n : ");
		int n = sc.nextInt();
		System.out.print("Please enter the value of k : ");
		int k = sc.nextInt();

		int result = kthFactor(n, k);
		if (result == -1) {
			System.out.println("n has less than k factors");
			System.out.println("The factors of n are: " + getFactors(n));
		} else {
			System.out.println("The " +k + "(th) factor of n is: " + result);
		}
		sc.close();
	}

	public static List<Integer> getFactors(int n) {
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static int kthFactor(int n, int k) {
		List<Integer> factors = getFactors(n);
		if (factors.size() < k) {
			return -1;
		} else {
			return factors.get(k - 1);
		}
	}

}
