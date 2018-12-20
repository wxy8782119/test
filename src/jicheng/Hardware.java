package jicheng;
//定义Hardware硬件维护工程师 继承 维护部员工类，重写工作方法
public class Hardware extends Maintainer {
	//@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}

