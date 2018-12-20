package test04.String01;

import java.util.Scanner;

public class String01 {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		String str=d.next();
		method(str);//获取指定字符串中，大写字母、小写字母、数字的个数。
		System.out.println("第一个字母转换成大写后的字符串："+convert(str));
		//将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
		
		//查询大字符串中，出现指定小字符串的次数
		String str1="hellojava,nihaojava,javazhenbang";
		System.out.println("“hellojava,nihaojava,javazhenbang”的字符串中出现java的次数："+getCount(str1,"java"));
	}
	
//		题目一：获取指定字符串中，大写字母、小写字母、数字的个数。
//		思路：1.为了统计大写字母、小写字母、数字的个数。创建3个计数的变量。
//			2.为了获取到字符串中的每个字符，进行字符串的遍历，得到每个字符。
//			3.对得到的字符进行判断，如果该字符为大写字母，则大写字母个数+1；如果该字符为小写字母，则小写字母个数+1；如果该字符为数字，则数字个数+1。
//			4.显示大写字母、小写字母、数字的个数
	public static void method(String str){
		int bigCount = 0; //大写字母的个数
		int smallCount = 0; //小写字母的个数
		int numberCount = 0; //数字的个数
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i); //获取指定位置上的字符
			if (ch>='A' && ch<='Z') {
				bigCount++;
			} else if (ch>='a' && ch<='z') {
				smallCount++;
			} else if (ch>='0' && ch<='9') {
				numberCount++;
			}
		}
		System.out.println("大写字母个数："+bigCount);
		System.out.println("小写字母个数："+smallCount);
		System.out.println("数字个数："+numberCount);
	}
	
//		题目二：将字符串中，第一个字母转换成大写，其他字母转换成小写，并打印改变后的字符串。
//		思路：1.把字符串分为两个部分，第一部分为字符串中第一个字母，第二部分为剩下的字符串。
//			2.把第一部分字符串转换成大写字母，把第二部分字符串转换成小写字母
//			3.把两部分字符串连接在一起，得到一个完整的字符串
	public static String convert(String str){
		//获取第一部分为字符串
		String start = str.substring(0,1);
		//获取第二部分为字符串
		String end = str.substring(1);
		//把第一部分字符串转换成大写字母，把第二部分字符串转换成小写字母
		String big = start.toUpperCase();
		String small = end.toLowerCase();
		//把两部分字符串连接在一起，得到一个完整的字符串
		return big+small;
	}
	
//		题目三：查询大字符串中，出现指定小字符串的次数。如“hellojava,nihaojava,javazhenbang”中查询出现“java”的次数。
//		思路：1.在大串中，查找小串出现的位置，出现了就次数+1
//			2.在上次小串出现位置的后面继续查找，需要更改大串的内容为上次未查询到的字符串。
//			3.回到第一步，继续查找小串出现的位置，直到大串中查询不到小串为止
	public static int getCount(String big, String small){
		int count = 0; //出现小串的次数
		int index = -1;//出现小串的位置
		/*
			while的循环条件三步骤：
			步骤一. big.indexOf(small) 获取小串在大串中出现的位置
			步骤二. 把小串出现的位置，赋值给变量index
			步骤三. 判断出现的位置是否为-1， 如果位置等于-1，说明大串中已经查询不到小串了；如果位置不等于-1，那么，进行循环，完成次数累加与修改大串的操作
		*/
		while ((index = big.indexOf(small)) != -1 ){
			count++;//出现次数+1
			//更改大串内容
			big = big.substring(index+1);
		}
		return count;
	}

}
