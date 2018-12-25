package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * 字符输入流缓冲流
	* java.io.BufferedReader 继承 Reader
	* 读取功能 read() 单个字符,字符数组
	* 构造方法:
		* BufferedReader(Reader r)
		* 可以任意的字符输入流
		   FileReader  InputStreamReader       
	* BufferedReader自己的功能
	* String readLine() 读取文本行 \r\n   
	* 方法读取到流末尾,返回null
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输入流缓冲流对象,构造方法传递字符输入流,包装数据源文件
		BufferedReader bfr=new BufferedReader(new FileReader("e:\\buffer.txt"));
		//调用缓冲流的方法 readLine()读取文本行
		//循环读取文本行, 结束条件 readLine()返回null
		int count=0;
		String line=null;
		while((line=bfr.readLine())!=null) { //readLine()方法没有换行
			count++;
			//System.out.print(line+"\r\n");
			System.out.println(count+" "+line);
		}
		bfr.close();
	}
	

}
