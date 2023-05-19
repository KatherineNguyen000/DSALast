package dsaLast;

import java.util.HashMap;
import java.util.List;

public class SockMerchant {

	public static void main(String[] args) {
		List<Integer> ar = List.of(1, 2, 1, 2, 1, 3, 2);
		int n = ar.size();
		int pairs = sockMerchant(n, ar);
		System.out.println("The number of pairs is : " + pairs);
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		int pairs = 0;
		HashMap<Integer, Integer> sockCount = new HashMap<Integer, Integer>();

		// Count socks of each color and store in HashMap
		for (int i = 0; i < n; i++) {
			int color = ar.get(i);
			if (sockCount.containsKey(color)) {
				int freq = sockCount.get(color);
				sockCount.put(color, freq + 1);
			} else {
				sockCount.put(color, 1);
			}
		}

		// Count pairs for each sock color
		for (int color : sockCount.keySet()) {
			int count = sockCount.get(color);
			if (count >= 2) {
				pairs += count / 2;
			}
		}
		return pairs;
	}

}
