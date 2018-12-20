package test01;

//描述猫类，继承动物类，重写eat方法，增加catchMouse方法
class Cat extends Animal {
	void eat() {
		System.out.println("吃鱼");
	}

	void catchMouse() {
		System.out.println("抓老鼠");
	}
}

