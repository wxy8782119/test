package yuangonglei;
//定义维护部员工类Maintainer 继承 员工类Employee
public abstract class Maintainer extends Employee {
	//空参数构造方法
	public Maintainer() {
		super();
	}
	//有参数构造方法
	public Maintainer(String id, String name) {
		super(id, name);
	}
}

