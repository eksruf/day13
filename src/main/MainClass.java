package main;

import java.util.Scanner;

import TV.TVClass;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		TVClass tv = new TVClass();
		
		while(true) {
			System.out.println("1.TV");
			System.out.println("2.냉장고");
			System.out.println("3.에어컨");
			num = input.nextInt();
			switch(num) {
			case 1:
				tv.display();
				break;
			case 2:break;
			case 3:break;
			}
		}
	}
}
