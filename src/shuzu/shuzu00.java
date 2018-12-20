package shuzu;

import java.util.Random;//引用java.util.Random包

public class shuzu00 {

	public static void main(String[] args) {
		Random rand=new Random();//创建一个Random对象
		int[] a=null;//声明整形数组a
		//开辟内存空间，rand.nextInt(10)返回一个[0,10)的随机整型数
		a=new int[rand.nextInt(10)];
		System.out.println("数组的长度为："+a.length);
		
		for(int i=0;i<a.length;i++) {
			a[i]=rand.nextInt(100);//rand.nextInt(100)返回一个[0,100)的随机整型数
			System.out.println("a["+i+"]="+a[i]);
		}

	}

}
