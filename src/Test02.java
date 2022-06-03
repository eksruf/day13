import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test02 {
	public int pw=1234;
	 LinkedHashMap menumap = new LinkedHashMap();
	 Scanner input = new Scanner(System.in);
/*
 get() : 매핑한 키의 value값을 가져옵니다.
isEmpty() : 맵안 데이터 존재 여부를 확인 합니다. 비어있다면 true를 리턴합니다.
containsKey() : 맵안에 해당 키가 존재하는지 확인합니다. 있다면 true를 리턴합니다.
size() : 맵의 크기를 확인합니다. 키쌍매핑이 1개라면 int 1 리턴합니다.
 */
	
//최초화면 
	public void print1() {
		menumap.put("아메리카노", 3000);
		System.out.println(menumap);
			money();//돈받아야지
		System.out.println("===menu===");
		menumap.put("아메리카노", 3000);
		System.out.println(menumap);
		//구매화면으로 넘기기
		choice();
		}
	//관리자 비밀번호
	public void pw() {
		System.out.print("비밀번호 입력: ");
		int pw = input.nextInt();
		if(pw!=1234) {
			System.out.println("잘못입력");   
		}else {
			manager();
		}
		
	}
//관리자용 화면 출력
	public void manager() {
		while(true) {
		System.out.println("1.메뉴추가");
		System.out.println("2.메뉴수정");
		System.out.println("3.메뉴삭제");
		System.out.print("번호입력: ");
		int num = input.nextInt();
		if(num==1) {
			//메뉴추가 넘기기
			add();
			break;
		}
		else if(num==2) {
			//메뉴수정 넘기기
			edit();
			break;
		}
		else if(num==3) {
			//메뉴삭제 객체로 넘기기
			x();break;
		}
		else {
			System.out.println("잘못입력.");
		}
		}
	}
	
//메뉴추가
	public void add() {
		System.out.println("추가할 메뉴를 입력해 주세요");
		System.out.print(">>>");
		String menu = input.next();
		System.out.println("가격을 입력하세요: ");
		String money = input.next();
		
		menumap.put(menu, money);
		System.out.println(menumap.keySet());
		System.out.println("메뉴가 추가 되었습니다.");
	}
//메뉴수정
	public void edit() {
		System.out.println(menumap.keySet());
		System.out.println("수정할 메뉴를 입력하세요");
		System.out.print(">>>");
		String editmenu = input.next();
		if(menumap.containsKey(editmenu)) {
			System.out.println("1.가격수정");
			System.out.println("2.종료");
			System.out.print("번호입력: ");
			int num = input.nextInt();
				if(num==1) {
					//가격수정
					editmoney(editmenu);
				}else if(num==2) {
					
				}
		}else {
			System.out.println("잘못입력.");
		}
		
	}
//메뉴삭제
	public void x() {
		System.out.println(menumap.keySet());
		System.out.println("삭제할 메뉴를 입력하세요");
		System.out.print(">>>");
		String menu = input.next();
		if(menumap.containsKey(menu)) {
			menumap.remove(menu);
			System.out.println("삭제되었습니다");
		}else {
			System.out.println("잘못입력.");
		}
	}
	//가격수정
	public void editmoney(String editmenu) {
		System.out.println("가격을 수정해 주세요");
		System.out.print(">>>");
		String money = input.next();
		menumap.put(editmenu, money);
	}
//메뉴가 없을때
//고객용 화면 출력
	//구매화면
	public void choice() {}
//금액투입
	public void money() {
		System.out.println("자판기에 금액을 입력해주세요");
		System.out.print(">>");
		int money = input.nextInt();
	}
//투입금액출력
}
