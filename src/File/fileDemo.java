package File;

import java.io.File;
import java.io.IOException;

public class fileDemo {
	public static void main(String[] args) throws IOException {
		//function();//路径
		//function_2();//创建文件功能
		//function_3();//创建文件夹功能
		//function_4();//删除功能
		function_1();//获取功能
	}
	//File类的构造函数
	public static void function() {
		//File构造函数演示
		String pathName = "e:\\java_code\\day22e\\hello.java";
		File f1 = new File(pathName);//将Test22文件封装成File对象。注意；有可以封装不存在文件或者文件夹，变成对象。
		System.out.println(f1);
				
		File f2 = new File("e:\\java_code\\day22e","hello.java");
		System.out.println(f2);
				
		//将parent封装成file对象。
		File dir = new File("e:\\java_code\\day22e");
		File f3 = new File(dir,"hello.java");
		System.out.println(f3);
	}
	
	//File类的获取
	public static void function_1() {
	//创建文件对象
		File file = new File("Test22.java");
		//获取文件的绝对路径，即全路径
		String absPath = file.getAbsolutePath();
		//File中封装的路径是什么获取到的就是什么。
		String path = file.getPath();
		//获取文件名称
		String filename = file.getName();
		//获取文件大小
		long size = file.length();
				
		System.out.println("absPath="+absPath);
		System.out.println("path="+path);
		System.out.println("filename="+filename);
		System.out.println("size="+size);
	}
	
	//File类创建文件功能
	public static void function_2() throws IOException {
		/*
		 *  File创建文件的功能
		 *  boolean createNewFile()
		 *  创建的文件路径和文件名,在File构造方法中给出
		 *  文件已经存在了,不再创建
		 */
		File file = new File("e:\\a.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
	
	//File类创建文件夹功能
	public static void function_3() {
		/*
		 *  File创建文件夹的功能
		 *  boolean mkdir()
		 *  mkdirs()创建多层文件夹
		 *  创建的文件路径和文件名,在File构造方法中给出
		 *  文件已经存在了,不再创建
		 */
		File file = new File("e:\\a");
		boolean b = file.mkdir();
		System.out.println(b);
		
		File file1 = new File("e:\\aa\\bbb\\v");
		boolean b1 =file1.mkdirs();
		System.out.println(b1);
	}
	
	//File类删除功能
	public static void function_4() {
		/*
		 *  File类的删除功能
		 *  boolean delete()
		 *  删除的文件或者是文件夹,在File构造方法中给出
		 *  删除成功返回true,删除失败返回false
		 *  删除方法,不走回收站,直接从硬盘中删除
		 *  删除有风险,运行需谨慎
		 *  不能删除多层文件夹
		 */
		File file =new File("e:\\a.txt");
		boolean b = file.delete();
		System.out.println(b);
		
	}
	
	

}
