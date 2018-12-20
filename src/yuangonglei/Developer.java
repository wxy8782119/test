package yuangonglei;
//定义研发部员工类Developer 继承 员工类Employee
public abstract class Developer extends Employee {
	//空参数构造方法
	public Developer() {
		super();
	}
	//有参数构造方法
	public Developer(String id, String name) {
		super(id, name);
	}
}
