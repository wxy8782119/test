package super_test;

class Student extends Person {
	// Student类的构造方法
	Student(String name, int age) {
		// 使用super关键字调用父类构造方法，进行相应的初始化动作
		super(name, age);
	}
	public void study() {// Studnet中特有的方法
		System.out.println(this.getName() + "同学在学习");
	}
}
