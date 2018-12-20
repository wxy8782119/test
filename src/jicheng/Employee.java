package jicheng;
//定义员工类(抽象类)
public abstract class Employee {
	private String id;// 员工编号
	private String name; // 员工姓名

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//工作方法（抽象方法）
	public abstract void work(); 
}

