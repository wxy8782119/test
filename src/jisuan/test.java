package jisuan;

public class test {
	public static void main(String[] args) {
		MathTool sum =new MathTool();
		System.out.println("两个数的和的二倍:"+sum.sum2times(3, 2));
		System.out.println("两个数的积:"+sum.area(3, 2));
		
		CFX cfx =new CFX(3, 2);
		System.out.println("长："+cfx.getChang());
		System.out.println("宽："+cfx.getKuan());
		System.out.println("周长"+cfx.zhouChang());
		System.out.println("面积"+cfx.mianJi());
	}
}
