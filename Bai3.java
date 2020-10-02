package Test;

public class Bai3 {
	public static void main(String[] args) {
		int[] arrInt = {1, 5, 4, 7, 9, 0, -10, 13, 93, 14, 15};
		findArray(arrInt);
	}
	
	private static void findArray(int[] arrInt) {
		int min = Math.abs(arrInt[0] - arrInt[1]);
		int n = arrInt.length;
		// Tìm khoảng cách nhỏ nhất
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int tg = Math.abs(arrInt[i] - arrInt[j]);
				if (min > tg) {
					min = tg;
				}
			}
		}
		// Tìm cách cặp số thỏa mãn
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int tg = Math.abs(arrInt[i] - arrInt[j]);
				if (min == tg) {
					System.out.println(arrInt[i] + " - " + arrInt[j]);
				}
			}
		}
	}
}
