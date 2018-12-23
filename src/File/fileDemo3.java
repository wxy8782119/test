package File;

import java.io.File;

public class fileDemo3 {
	public static void main(String[] args) {
		//function();
		function_1();
		function_2();
	}
	/*
	 *  File类的获取功能
	 *  String[] list()
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回只有名字
	 */
	public static void function() {
		File file=new File("e:\\java");
		String[] strArr=file.list();
		System.out.println("对象的个数："+strArr.length);//对象的个数
		for(String str:strArr) {
			System.out.println(str);
		}
	}
	/*
	 *  File类的获取功能
	 *  File[] listFiles()
	 *  获取到,File构造方法中封装的路径中的文件和文件夹名 (遍历一个目录)
	 *  返回的是目录或者文件的全路径
	 */
	public static void function_1() {
		File file=new File("e:\\java");
		File[] fileArr=file.listFiles();
		System.out.println("对象的个数："+fileArr.length);//对象的个数
		for(File f:fileArr) {
			System.out.println(f);
		}
	}
	/*
	 * 获取系统中所有根目录
	 */
	public static void function_2() {
		File[] fileArr=File.listRoots();
		System.out.println(fileArr.length);
		for(File f:fileArr) {
			System.out.println(f);
		}
		
	}
}
