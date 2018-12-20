package jisuan;

//长方形类
public class CFX {
	//因为长与宽，在现实事物中属于事物的一部分，所以定义成员变量
	private int chang;
	private int kuan;
	
	public CFX(int chang, int kuan) {
		this.chang = chang;
		this.kuan = kuan;
	}
	
	//求长与宽的周长
	public double zhouChang() {
		return (chang+kuan)*2;
	}
	//求长与宽的面积
	public double mianJi() {
		return chang*kuan;
	}
	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}
	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
}
