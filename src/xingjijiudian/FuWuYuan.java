package xingjijiudian;

/*
 * 定义员工的子类 服务员类
 */
public class FuWuYuan extends YuanGong implements VIP {
	//空参数构造方法
	public FuWuYuan() {
		super();
	}
	//满参数构造方法
	public FuWuYuan(String xingMing, String gongHao) {
		super(xingMing, gongHao);
	}
	@Override
	//重写抽象方法
	public void work() {
		System.out.println("亲，全身心为您服务，记得给好评哦");
	}
	@Override
	public void server() {
		System.out.println("给顾客倒酒");
	}
}
