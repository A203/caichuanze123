package day01;

import java.util.Scanner;


public class Homework1 {
	public void hello(){
		System.out.println("请输入你的名字");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		System.out.println("Hello  "+name);
	}
	public void ex01(){
		Boolean b1=new Boolean("true");
		Boolean b2=new Boolean("false");
		Boolean b3=new Boolean("0");
		System.out.println(b1+"  "+b2+"  "+b3);
	}
	public void ex02(){
		char c1='d';
		char c2='好';
		System.out.println(c1+"  "+c2+"  ");
	}
	public void ex03(){
		int i=1;
		float j=10.2f;
		double d=2.5;
		byte b=5;
	}
	public enum Operation{
		ONE,TWO,THREE;
	}
	public void ex04(){
		System.out.println("|1.增加一个学生|");
		System.out.println("|2.显示所有学生|");
		System.out.println("|3.退出程序|");
		System.out.println("|请输入选择（1-3）");
		Scanner scanner=new Scanner(System.in);
		int s=scanner.nextInt();
		Operation oper = Operation.ONE;
		if (s == 1) {
			oper=Operation.ONE;
		}
		if (s == 2) {
			oper=Operation.TWO;
		}
		if (s == 3) {
			oper=Operation.THREE;
		}
		switch(oper){
		case ONE:add();break;
		case TWO:display();break;
		case THREE:return ;
		}
	}
	public void add(){
		
	}
	public void display(){
		
	}
public static void main(String[] args) {
	Homework1 homework=new Homework1();
//	homework.hello();
//	homework.ex01();
//	homework.ex02();
//	homework.ex03();
	homework.ex04();
}
}

