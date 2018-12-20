package suijidianming;
import java.util.Random;
import java.util.Scanner;

public class CallName1 {
	public static void main(String[] args) {
		System.out.println("--------随机点名器--------");
		// 创建一个存储多个同学名字的容器（数组）
		String[] students = new String[3];
		/*
		 * 1.存储全班同学名字
		 */
		addStudentName(students);
		/*
		 * 2.打印全班同学每一个人的名字
		 */
		printStudentName(students);
		/*
		 * 3.获取随机点名到的学生姓名，并打印
		 */
		String randomName = randomStudentName(students);
		System.out.println("被点到名的同学是 :" + randomName);
	}
	/**
	 * 1.存储全班同学名字
	 * 	创建一个存储多个同学名字的容器（数组） 
	 *  键盘输入每个同学的名字，存储到容器中（数组）
	 */
	public static void addStudentName(String[] students) {
		//键盘输入多个同学名字存储到容器中
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("存储第"+i+"个名称：");
			students[i] = sc.next();
		}
	}
	/**
	 * 2打印全班同学每一个人的名字
	 */
	public static void printStudentName(String[] students) {
		//遍历数组，得到每个同学名字
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			//打印同学名字
			System.out.println("第"+i+"个学生名称：" + name);
		}
	}
	/**
	 * 3.在班级总人数范围内，随机产生一个随机数,返回随机数位置上的学生姓名
	 */
	public static String randomStudentName(String[] students) {
		//根据数组长度，获取随机索引
		int index = new Random().nextInt(students.length);
		//通过随机索引从数组中获取名称
		String name = students[index];
		//返回随机点到的名称
		return name;
	}
}
