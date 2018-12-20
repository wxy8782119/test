package xingjijiudian;

/*
 * 经理在员工的基础上，添加了奖金成员
 */
public class JingLi extends YuanGong {
	//定义奖金属性
	private double jiangJin;
	//空参数构造方法
	public JingLi() {
		super();
	}
	//满参数构造方法
	public JingLi(String xingMing, String gongHao, double jiangJin) {
		super(xingMing, gongHao);
		this.jiangJin = jiangJin;
	}

	public double getJiangJin() {
		return jiangJin;
	}
	public void setJiangJin(double jiangJin) {
		this.jiangJin = jiangJin;
	}
	//重写抽象方法
	@Override
	public void work() {
		System.out.println("哪个员工让顾客不满意，我扣谁钱");
	};
}
