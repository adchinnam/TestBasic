package Test;

public class Bai2 {
	
	public static void main(String[] args) {
		int[] arrInt = {1, 2,3, 4, 5, 6, 7,7,8, 9,8, 10, 10};
		System.out.println("Tong : " + findSum(arrInt));
	}
	
	private static int findSum(int[] arrInt) {
		int n = arrInt.length;
		// Sắp xếp mảng giảm dần
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arrInt[i] < arrInt[j]) {
					int tg = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tg;
				}
			}
		}
		// Cộng 2 phần tử đầu tiên (= 2 phần tử lớn nhất mảng)
		return arrInt[0] + arrInt[1];
	}

}
