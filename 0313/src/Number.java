
import java.util.Random;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int rand = rd.nextInt(50)+1;
        for(int i=1; i<=5; i++) {
            System.out.print("1~50까지 중 숫자 입력 : ");
            int num = sc.nextInt();
            if(num==rand) {
                System.out.println(" 축하합니다. ");
            } else if(num > rand) {
                System.out.println("너무 큽니다."+"("+i+")");
            } else {
                System.out.println("너무 작습니다."+"("+i+")");
            }
        }
        System.out.println("랜덤 숫자는 "+rand+"입니다.");

    }

}