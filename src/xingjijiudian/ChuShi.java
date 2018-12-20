package xingjijiudian;

/*
 * 定义员工的子类 厨师类
 */
public class ChuShi extends YuanGong implements VIP{
	//空参数构造方法
	public ChuShi() {
		super();
	}
	//满参数构造方法
	public ChuShi(String xingMing, String gongHao) {
		super(xingMing, gongHao);
	}

	@Override
	//抽象方法重写
	public void work() {
		System.out.println("我做饭，放心吃吧，包您满意");
	}
	@Override
	public void server() {
		System.out.println("做菜加量加料");
	}
}
