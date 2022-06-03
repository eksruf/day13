package com.itbank.java;

import com.itbank.kim.*; //다른 페키지에 있으면 임폴트 있어야함 (*은 모든파일이다)


public class MainClass {
public static void main(String[] args) {
	TestClass t =new TestClass();
	t.test();
	
	com.itbank.kim.TestClass t01 = new com.itbank.kim.TestClass();
	t01.test();
	
	TestClass01 tt01 = new TestClass01();
	tt01.test01();
	
	
	
	
}
}
