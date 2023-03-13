import java.util.Scanner;

//1번
public class BookManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요>>");
		String name = sc.next();
		System.out.println(name + "님 안녕하세요");
		
		Book b1 = new Book("이것이 자바다", "신용권", 100);
		Book b2 = new Book("정보 보안 개론", "양대일", 200);
		Book b3 = new Book("모의해킹이란 무엇인가", "조정원", 300);
		Book b4 = new Book("인생의 태도", "웨인 다이어", 400);
		
		System.out.print(b1.book_count);
		
		b1.rental();
		b2.rental();
		b3.rental();
		b1.back();
		b3.back();
		b2.check();
		b3.check();
	}

}

class Book{
	String title = "";
	String writer = "";
	int number = 0;
	boolean pos = false;
	int book_count = 0;
	
	public Book() {
		book_count ++;
	}
	
	public Book(String title,String writer, int number) {
		this.title = title;
		this.writer = writer;
		this.number = number;
		book_count ++;
	}
	
	public void rental() {
		book_count --;
		System.out.println(number + "번 대여 완료");
		pos = false;
	}
	public void back() {
		book_count ++;
		System.out.println(number + "번 반납 완료");
		pos = true;
	}
	public void check() {
		if(pos == true) {
			System.out.println(title + "는 대여 가능합니다.");
		}
		else {
			System.out.println(title + "는 이미 대여중입니다.");
		}
	}
	
	
}