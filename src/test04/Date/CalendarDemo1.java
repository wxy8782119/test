package test04.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo1 {
//	获取时间
	public static void function_1() {
		Calendar c = Calendar.getInstance();
		//获取年份
		int year =c.get(Calendar.YEAR);
		//获取月份
		int month =c.get(Calendar.MONTH)+1;
		//获取天数
		int day =c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
		
	}
	
//	设置指定的时间
	public static void function_2() {
		Calendar c=Calendar.getInstance();
		//设置月份到9月份
		//c.set(Calendar.MONTH, 9);
//		设置年月日
		c.set(2020,4,12);
		//获取年份
		int year =c.get(Calendar.YEAR);
		//获取月份
		int month =c.get(Calendar.MONTH);
		//获取天数
		int day =c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日");
		
	}
	
	/*
	 * Calendar类方法add 日历的偏移量,
	 * 可以指定一个日历中的字段,
	 * 进行整数的偏移 add(int field, int value)
	 */
	public static void function_3() {
		Calendar c =Calendar.getInstance();
//		让日历中的天数，向后偏移280天
		c.add(Calendar.DAY_OF_MONTH, 210);
		//获取年份
		int year =c.get(Calendar.YEAR);
		//获取月份
		int month =c.get(Calendar.MONTH)+1;
		//获取天数
		int day =c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "年" + month + "月" + day + "日"); 
	}
	
//	5.1	求出自己已经出生多少天
//	思路：
//	1.获取当前时间对应的天数
//		2.获取自己出生日期对应的天数
//		3.两个时间相减（当前时间天数 – 出生日期天数）
/*	public static void function_4() {
		Calendar my =Calendar.getInstance();
		Calendar c =Calendar.getInstance();
		//设置出生年月日 1993-12-27
		my.set(Calendar.YEAR, 1993);
		my.set(Calendar.MONTH,12);
		my.set(Calendar.DATE,27);
		//获取时间中的天数
		int day = c.get(Calendar.DATE);
		int myDay = my.get(Calendar.DATE);
		System.out.println(myDay-day);

	}*/
	public static void function_4() throws Exception {
		System.out.println("请输入出生日期 格式 YYYY-MM-dd");
		//获取出生日期,键盘输入
		String birthdayString = new Scanner(System.in).next();
		//将字符串日期,转成Date对象
		//创建SimpleDateFormat对象,写日期模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//调用方法parse,字符串转成日期对象
		Date birthdayDate = sdf.parse(birthdayString);
		
		//获取今天的日期对象
		Date todayDate = new Date();
		
		//将两个日期转成毫秒值,Date类的方法getTime
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long secone = todaySecond-birthdaySecond;
		
		if(secone < 0){
			System.out.println("还没出生呢");
		}
		else{
		System.out.println(secone/1000/60/60/24);
		}
		
	}

	public static void main(String[] args) throws Exception {
		function_1();
		function_2();
		function_3();
		function_4();
	}

}
