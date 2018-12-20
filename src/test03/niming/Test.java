package test03.niming;

class Test {
	public static void main(String[] args) {
		//调用getPerson方法，得到一个Person对象
		Person person = Demo.getPerson();
		
		//调用method方法
		Demo.method(person);
		//匿名对象作为方法接收的参数
		Demo.method(new Person());
	}
}

