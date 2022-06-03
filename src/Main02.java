import java.util.Scanner;

public class Main02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Test02 t = new Test02();
	int num=0;
	while(true) {
	System.out.println("1.물품 구매");
	System.out.println("2.관리자");
	System.out.println("3.종료");
	System.out.print("번호입력: ");
	num = input.nextInt();
	System.out.println();
	System.out.println();
	
	switch (num) {
	case 1:
		//최초화면
		t.print1();
		break;
		//고객용 화면 출력
		//금액투입
		//투입금액출력
	case 2:
		t.pw();
		//관리자용 화면 출력
		;break;
		//메뉴추가
		//메뉴수정
		//메뉴가 없을때
	case 3:
		break;
	}
}
}
}
