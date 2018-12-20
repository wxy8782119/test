package yuangonglei;
//定义Hardware硬件维护工程师 继承 维护部员工类，重写工作方法
public class Hardware extends Maintainer {
	//空参数构造方法
	public Hardware() {
		super();
	}
	//有参数构造方法
	public Hardware(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}

