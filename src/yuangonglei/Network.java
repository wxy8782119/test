package yuangonglei;
//义Network网络维护工程师 继承 维护部员工类，重写工作方法
public class Network extends Maintainer {
	//空参数构造方法
	public Network() {
		super();
	}
	//有参数构造方法
	public Network(String id, String name) {
		super(id, name);
	}

	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在检查网络是否畅通");
	}
}
