package yuangonglei;
//定义Android工程师 继承 研发部员工类，重写工作方法
public class Android extends Developer {
	//空参数构造方法
	public Android() {
		super();
	}
	//有参数构造方法
	public Android(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在研发淘宝手机客户端软件");
	}
}
