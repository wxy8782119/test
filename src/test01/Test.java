package test01;

public class Test {
	public static void main(String[] args) {
		Animal a = new Dog(); //多态形式，创建一个狗对象
		a.eat(); // 调用对象中的方法，会执行狗类中的eat方法
		// a.lookHome();//使用Dog类特有的方法，需要向下转型，不能直接使用
		
		// 为了使用狗类的lookHome方法，需要向下转型
// 向下转型过程中，可能会发生类型转换的错误，即ClassCastException异常
		// 那么，在转之前需要做健壮性判断 
		if( !(a instanceof Dog)){ // 判断当前对象是否是Dog类型
		 		System.out.println("类型不匹配，不能转换"); 
		 		return; 
		} 
		Dog d = (Dog) a; //向下转型
		d.lookHome();//调用狗类的lookHome方法
		
		Animal b =new Cat();
		b.eat();
		Cat c =(Cat) b;
		c.catchMouse();
	}
}
