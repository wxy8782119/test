package FileInputStream;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
	/*
	 *  FileInputStream读取文件
	 *   读取方法  int read(byte[] b) 读取字节数组
	 *   数组作用: 缓冲的作用, 提高效率
	 *   read返回的int,表示什么含义 读取到多少个有效的字节数
	 */
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("e:\\b.txt");
		//创建字节数组
		byte[] b=new byte[1024];
		int len = 0;
		while((len=fis.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
		fis.close();
	}
	
	
}
