package ArrayList;

public class Person {
	private String name;
	private int age;
	private int id;
	public Person(String name, int age, int id) {
		//super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "名字：" + name + "， 年龄：" + age + "， id=" + id ;
	}
	
	
	
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	/*public Person(String name) {
		//super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}*/

	
}
