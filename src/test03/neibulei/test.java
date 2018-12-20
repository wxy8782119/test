package test03.neibulei;

public class test {
	public static void main(String[] args) {
		//创建内部类对象
		Body.Heart bh = new Body().new Heart();
		//调用内部类中的方法
		bh.jump();
	}
}
