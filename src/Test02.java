import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test02 {
	public int pw=1234;
	 LinkedHashMap menumap = new LinkedHashMap();
	 Scanner input = new Scanner(System.in);
/*
 get() : ������ Ű�� value���� �����ɴϴ�.
isEmpty() : �ʾ� ������ ���� ���θ� Ȯ�� �մϴ�. ����ִٸ� true�� �����մϴ�.
containsKey() : �ʾȿ� �ش� Ű�� �����ϴ��� Ȯ���մϴ�. �ִٸ� true�� �����մϴ�.
size() : ���� ũ�⸦ Ȯ���մϴ�. Ű�ָ����� 1����� int 1 �����մϴ�.
 */
	
//����ȭ�� 
	public void print1() {
		menumap.put("�Ƹ޸�ī��", 3000);
		System.out.println(menumap);
			money();//���޾ƾ���
		System.out.println("===menu===");
		menumap.put("�Ƹ޸�ī��", 3000);
		System.out.println(menumap);
		//����ȭ������ �ѱ��
		choice();
		}
	//������ ��й�ȣ
	public void pw() {
		System.out.print("��й�ȣ �Է�: ");
		int pw = input.nextInt();
		if(pw!=1234) {
			System.out.println("�߸��Է�");   
		}else {
			manager();
		}
		
	}
//�����ڿ� ȭ�� ���
	public void manager() {
		while(true) {
		System.out.println("1.�޴��߰�");
		System.out.println("2.�޴�����");
		System.out.println("3.�޴�����");
		System.out.print("��ȣ�Է�: ");
		int num = input.nextInt();
		if(num==1) {
			//�޴��߰� �ѱ��
			add();
			break;
		}
		else if(num==2) {
			//�޴����� �ѱ��
			edit();
			break;
		}
		else if(num==3) {
			//�޴����� ��ü�� �ѱ��
			x();break;
		}
		else {
			System.out.println("�߸��Է�.");
		}
		}
	}
	
//�޴��߰�
	public void add() {
		System.out.println("�߰��� �޴��� �Է��� �ּ���");
		System.out.print(">>>");
		String menu = input.next();
		System.out.println("������ �Է��ϼ���: ");
		String money = input.next();
		
		menumap.put(menu, money);
		System.out.println(menumap.keySet());
		System.out.println("�޴��� �߰� �Ǿ����ϴ�.");
	}
//�޴�����
	public void edit() {
		System.out.println(menumap.keySet());
		System.out.println("������ �޴��� �Է��ϼ���");
		System.out.print(">>>");
		String editmenu = input.next();
		if(menumap.containsKey(editmenu)) {
			System.out.println("1.���ݼ���");
			System.out.println("2.����");
			System.out.print("��ȣ�Է�: ");
			int num = input.nextInt();
				if(num==1) {
					//���ݼ���
					editmoney(editmenu);
				}else if(num==2) {
					
				}
		}else {
			System.out.println("�߸��Է�.");
		}
		
	}
//�޴�����
	public void x() {
		System.out.println(menumap.keySet());
		System.out.println("������ �޴��� �Է��ϼ���");
		System.out.print(">>>");
		String menu = input.next();
		if(menumap.containsKey(menu)) {
			menumap.remove(menu);
			System.out.println("�����Ǿ����ϴ�");
		}else {
			System.out.println("�߸��Է�.");
		}
	}
	//���ݼ���
	public void editmoney(String editmenu) {
		System.out.println("������ ������ �ּ���");
		System.out.print(">>>");
		String money = input.next();
		menumap.put(editmenu, money);
	}
//�޴��� ������
//���� ȭ�� ���
	//����ȭ��
	public void choice() {}
//�ݾ�����
	public void money() {
		System.out.println("���Ǳ⿡ �ݾ��� �Է����ּ���");
		System.out.print(">>");
		int money = input.nextInt();
	}
//���Աݾ����
}
