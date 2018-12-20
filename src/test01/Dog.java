package test01;

//描述狗类，继承动物类，重写eat方法，增加lookHome方法
class Dog extends Animal {
	void eat() {
		System.out.println("啃骨头");
	}

	void lookHome() {
		System.out.println("看家");
	}
}

