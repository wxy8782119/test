package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
 *字符输出流缓冲区流
 * java.io.BufferedWriter 继承 Writer
 * 写入方法 write () 单个字符,字符数组,字符串
  
 * 构造方法:
	* BufferedWriter(Writer w)传递任意字符输出流
	* 传递谁,就高效谁
	* 能传递的字符输出流 FileWriter, OutputStreamWriter
	* newLine() 写换行
	* newLine()文本中换行, \r\n也是文本换行
			* 方法具有平台无关性
			* Windows  \r\n
			* Linux    \n
				 
			* newLine()运行结果,和操作系统是相互关系
			* JVM: 安装的是Windows版本,newLine()写的就是\r\n
			* 安装的是Linux版本,newLine()写的就是\n
/*
 *  将数据源 c:\\a.txt
 *  复制到 d:\\a.txt  数据目的
 *  字节输入流,绑定数据源
 *  字节输出流,绑定数据目的
 *  
 *  输入,读取1个字节
 *  输出,写1个字节
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输出流,封装文件
		FileWriter fw=new FileWriter("e:\\buffer.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
		bfw.write("hello");
		bfw.newLine();//换行
		bfw.flush();
		bfw.write("你好".toCharArray());
		bfw.newLine();//换行
		bfw.flush();
		bfw.write("你好");
		bfw.newLine();//换行
		bfw.flush();
		bfw.write("java");
		bfw.newLine();//换行
		bfw.flush();
		
		bfw.close();
	}
}
