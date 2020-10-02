package Test;

public class Bai1 {
	
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		sort2(arrInt, 3);
	}
	
	private static void sort2(int[] arrInt, int n) {
		int tg = arrInt.length/n;
		for (int j = 0; j < tg; j++) {
			for (int i = 0; i < n; i++) {
				System.out.println(arrInt[tg*i + j]);
			}
		}
	}

}
