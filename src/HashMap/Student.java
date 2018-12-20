package HashMap;

public class Student {
	private String name;
	private int age;
	//构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//get,set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//toString方法
	@Override
	public String toString() {
		return "学生 姓名=" + name + ", 年龄=" + age;
	}
	
}
