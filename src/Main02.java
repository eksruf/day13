import java.util.Scanner;

public class Main02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Test02 t = new Test02();
	int num=0;
	while(true) {
	System.out.println("1.��ǰ ����");
	System.out.println("2.������");
	System.out.println("3.����");
	System.out.print("��ȣ�Է�: ");
	num = input.nextInt();
	System.out.println();
	System.out.println();
	
	switch (num) {
	case 1:
		//����ȭ��
		t.print1();
		break;
		//���� ȭ�� ���
		//�ݾ�����
		//���Աݾ����
	case 2:
		t.pw();
		//�����ڿ� ȭ�� ���
		;break;
		//�޴��߰�
		//�޴�����
		//�޴��� ������
	case 3:
		break;
	}
}
}
}
