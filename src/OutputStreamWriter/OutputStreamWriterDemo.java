package OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//writeGBK();
		writeUTF();
	}
	/*
	 * 转换流对象 OutputStreamWriter写文本
	 * 文本采用GBK的形式写入
	 */
	public static void writeGBK() throws IOException {
		//创建字节输出流，绑定数据文件
		FileOutputStream fos=new FileOutputStream("e:\\gbk.txt");
		//创建转换流对象，构造方法，绑定字节输出流，使用GBK编码表
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		//转换流写数据
		osw.write("你好");
		osw.close();
	}
	/*
	 * 转换流对象OutputStreamWriter写文本
	 * 采用UTF-8编码表写入
	 */
	public static void writeUTF() throws IOException {
		//创建字节输出流，绑定文件
		FileOutputStream fos=new FileOutputStream("e:\\utf.txt");
		//创建转换流对象，构造方法保证字节输出流，并指定编码表是UTF-8
		OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
		osw.write("你好");
		osw.close();
	}
}
