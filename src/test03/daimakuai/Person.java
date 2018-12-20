package test03.daimakuai;

public class Person {
	private String name;
	private int age;
	
     //构造代码块
	{
		System.out.println("构造代码块执行了");
	}
	Person(){
		System.out.println("Person无参数的构造函数执行");
	}
	Person(int age){
		this.age = age;
		System.out.println("Person（age）参数的构造函数执行");
	}
}

