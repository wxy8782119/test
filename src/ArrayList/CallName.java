package ArrayList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CallName {
	public static void main(String[] args){
		//定义集合,存储的是StudentName类型变量
		ArrayList <StudentName> array = new ArrayList<StudentName>();
		//调用添加方法
		add (array);
		//调用遍历集合
		printArrayList(array);
		
		randomStudentName(array);
	}
	/*
	  随机数,当作集合的索引,到集合中找到元素
	*/
	public static void randomStudentName(ArrayList<StudentName> array ){
		Random r = new Random();
		int number = r.nextInt( array.size());
		//随机数,索引,到集合中get
		StudentName s = array.get(number);
		System.out.println( s.name +"  "+s.age);
	}
	
	/*
	    总览学生的信息,遍历集合
	*/
	public static void printArrayList(ArrayList<StudentName> array){
		for(int i = 0 ; i < array.size();i++){
			//存储集合的时候, 集合.add(sn1)  sn1 是StudentName类型变量
			//获取的时候,集合.get方法,获取出来的是什么, 还是StudentName类型变量
			StudentName s = array.get(i);
			System.out.println(s.name+"  "+s.age);
		}
	}
	
	/*
	   定义方法,实现存储学生的姓名和年龄
	   创建StudentName类型变量,存储到集合中
	*/
	public static void add (ArrayList<StudentName> array){
		//创建StudentName类型变量
		/*StudentName sn1 = new StudentName();
		StudentName sn2 = new StudentName();
		StudentName sn3 = new StudentName();
		StudentName sn4 = new StudentName();
		StudentName sn5 = new StudentName();
		
		sn1.name = "张三1";
		sn1.age = 201;
		
		sn2.name = "张三2";
		sn2.age = 202;
		
		sn3.name = "张三3";
		sn3.age = 203;
		
		sn4.name = "张三4";
		sn4.age = 204;
		
		sn5.name = "张三5";
		sn5.age = 205;
		
		//将StudentName变量,存储到集合中
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);*/
		//键盘输入多个同学名字存储到容器中
				Scanner sc = new Scanner(System.in);
				for (int i = 0; i < 3; i++) {
					//创建学生
					StudentName s = new StudentName();
					System.out.println("存储第"+i+"个学生姓名：");
					s.name = sc.next();
					System.out.println("存储第"+i+"个学生年龄：");
					s.age = sc.nextInt();
					//添加学生到集合
					array.add(s);
				}

	}

}
