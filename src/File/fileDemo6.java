package File;

import java.io.File;

public class fileDemo6 {
	/*
	 *  遍历目录,获取目录下的所有.java文件
	 *  遍历多级目录,方法递归实现
	 *  遍历的过程中,使用过滤器
	 */
	public static void main(String[] args) {
		getAllJava(new File("e:\\a"));
	}
	/*
	 * 定义方法,实现遍历指定目录
	 * 获取目录中所有的.java文件
	 */
	public static void getAllJava(File dir){
		//调用File对象方法listFiles()获取,加入过滤器
		File[] fileArr = dir.listFiles(new MyJavaFilter());
		for(File f : fileArr){
			//对f路径,判断是不是文件夹
			if(f.isDirectory()){
				//递归进入文件夹遍历
				getAllJava(f);
			}else{
				System.out.println(f);
			}
		}
	}

}
