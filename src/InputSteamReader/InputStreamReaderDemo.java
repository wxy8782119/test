package InputSteamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		readGBK();
		readUTF();
	}
	/*
	 *  转换流,InputSteamReader读取文本
	 *  采用系统默认编码表,读取GBK文件
	 */
	public static void readGBK() throws IOException{
		//创建自己输入流,传递文本文件
		FileInputStream fis=new FileInputStream("e:\\gbk.txt");
		//创建转换流对象,构造方法,包装字节输入流
		InputStreamReader isr=new InputStreamReader(fis);
		char[] ch=new char[1024];
		int len=isr.read(ch);
		System.out.println(new String(ch,0,len));
		isr.close();;
	}
	/*
	 *  转换流,InputSteamReader读取文本
	 *  采用UTF-8编码表,读取文件utf
	 */
	public static void readUTF() throws IOException {
		//创建自己输入流,传递文本文件
		FileInputStream fis=new FileInputStream("e:\\utf.txt");
		//创建转换流对象,构造方法中,包装字节输入流,同时写编码表名
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		char[] ch=new char[1024];
		int len=isr.read(ch);
		System.out.println(new String(ch,0,len));
		isr.close();
	}

}
