
public class Array {
	public static void main(String[] args) {
		int num[] = { 94, 85, 95, 88, 90 };
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
