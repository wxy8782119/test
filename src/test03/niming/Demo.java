package test03.niming;

class Demo {
	public static Person getPerson(){
		//普通方式
		//Person p = new Person();	
		//return p;
		
		//匿名对象作为方法返回值
		return new Person(); 
	}
	
	public static void method(Person p){}
}
