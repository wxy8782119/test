package fengzhuang;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CallName{
	public static void main(String[] args) {
	ArrayList<Student> list = new ArrayList<Student>(); //1.1创建一个可以存储多个同学名字的容器
	/*
	 * 1.存储全班同学信息
	 */
	addStudent(list);
	/*
	 * 2.打印全班同学每一个人的信息（姓名、年龄）
	 */
	printStudent(list);
	/*
	 * 3.随机对学生点名，打印学生信息
	 */
	randomStudent(list);
	}
	
	/**
	 * 1.存储全班同学名字
	 */
	public static void addStudent(ArrayList<Student> list) {
		//键盘输入多个同学名字存储到容器中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			//创建学生
			Student s = new Student();
			System.out.println("存储第"+i+"个学生姓名：");
			String name = sc.next();
			s.setName(name);
			System.out.println("存储第"+i+"个学生年龄：");
			int age = sc.nextInt();
			s.setAge(age);
			//添加学生到集合
			list.add(s);
		}
	}
	
	/**
	 * 2.打印全班同学每一个人的信息（姓名、年龄）
	 */
	public static void printStudent (ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println("姓名："+s.getName() +",年龄："+s.getAge());
		}
	}
	
	/**
	 * 3.随机对学生点名，打印学生信息
	 */
	public static void randomStudent (ArrayList<Student> list) {
		//在班级总人数范围内，随机产生一个随机数
		int index = new Random().nextInt(list.size());
		//在容器（ArrayList集合）中，查找该随机数所对应的同学信息（姓名、年龄）
		Student s = list.get(index);
		System.out.println("被随机点名的同学："+s.getName() + "，年龄:" + s.getAge());
	}



}


