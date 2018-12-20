package xingjijiudian;

/*
 * 	员工：
		 姓名 String
		 工号 String
 */
public abstract class YuanGong {
	// 成员变量
	private String xingMing;
	private String gongHao;
	// 空参数构造方法
	public YuanGong() {
		super();
	}
	//满参数构造方法
	public YuanGong(String xingMing, String gongHao) {
		super();
		this.xingMing = xingMing;
		this.gongHao = gongHao;
	
	}
	// 抽象方法
	public abstract void work();
	
	// getters与setters
	public String getXingMing() {
		return xingMing;
	}
	public void setXingMing(String xingMing) {
		this.xingMing = xingMing;
	}
	public String getGongHao() {
		return gongHao;
	}
	public void setGongHao(String gongHao) {
		this.gongHao = gongHao;
	}
	
}

