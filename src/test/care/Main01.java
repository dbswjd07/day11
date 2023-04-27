package test.care;

import java.util.Date;

import test.java.TestClass01;
import test.java.TestClass02;
import test.java.TestClass03;

//import test.java.*;

public class Main01 {
public static void main(String[] args) {
	
	Test01 t = new Test01();
	t.test();
	t.num = 111;
	
	TestClass01 t01 = new TestClass01();
	t01.test();
	
	TestClass02 t02 = new TestClass02();
	TestClass03 t03 = new TestClass03();
	
	test.date.Date dd = new test.date.Date();
	dd.data();
	
	test.java.Date d01 = new test.java.Date();
	d01.date();
	
	Date d02 = new Date();
	System.out.println(d02);
}
}
