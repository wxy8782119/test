package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		function();
		function_1();
		function_2();
	}
	public static void function() {
		//创建HashSet对象
		HashSet<String> hs = new HashSet<String>();
		//给集合中添加自定义对象
		hs.add("zhangsan");
		hs.add("lisi");
		hs.add("wangwu");
		hs.add("zhangsan");
		//取出集合中的每个元素
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		//HashSet中不能存储重复元素,无顺序
		System.out.println("------------------");
	}
	public static void function_1() {
		//创建HashSet对象
		//HashSet<Student> hs = new HashSet<Student>();
		HashSet hs = new HashSet();
		//给集合中添加自定义对象
		hs.add(new Student("zhangsan",21));
		hs.add(new Student("lisi",22));
		hs.add(new Student("wangwu",23));
		hs.add(new Student("zhangsan",21));
		//取出集合中的每个元素
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s);
			}
	}
	public static void function_2() {
		//LinkedHashSet中不能存储重复元素,有顺序
		Set<String> set = new LinkedHashSet<String>();
		set.add("bbb");
		set.add("aaa");
		set.add("abc");
		set.add("bbc");
		set.add("bbb");
		set.add("aaa");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
		
}

