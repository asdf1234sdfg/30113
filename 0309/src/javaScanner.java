import java.util.Scanner;

public class javaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int a = sc.nextInt();
		System.out.print("마지막 숫자 : ");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.print(a + "부터 " + b + "까지의 합은 " + sum);

	}

}
