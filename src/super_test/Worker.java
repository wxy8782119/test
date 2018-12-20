package super_test;

class Worker extends Person {
	Worker(String name, int age) {
		// 使用super关键字调用父类构造方法，进行相应的初始化动作
		super(name, age);
	}
	public void work() {// Worker 中特有的方法
		System.out.println(this.getName() + "工人在工作");
	}
}
