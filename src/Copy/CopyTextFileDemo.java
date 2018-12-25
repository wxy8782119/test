package Copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 采用高效的字符缓冲流，完成文本文件的赋值
 * 
 * 数据源： file.txt
 * 目的地： copyFile.txt
 * 
 * 分析：
 * 	1，指定数据源， 是数据源中读数据，采用输入流
 * 	2,指定目的地，是把数据写入目的地，采用输出流
 * 	3,读数据
 * 	4，写数据
 * 	5，关闭流
 */

public class CopyTextFileDemo {
	public static void main(String[] args) throws IOException {
		//1，指定数据源， 是数据源中读数据，采用输入流
		BufferedReader in = new BufferedReader(new FileReader("e:\\buffer.txt"));
		//2,指定目的地，是把数据写入目的地，采用输出流
		BufferedWriter out = new BufferedWriter(new FileWriter("e:\\d\\buffer.txt"));
		//3,读数据
		String line = null;
		while ( (line = in.readLine()) != null ) {
			//4，写数据
			out.write(line);
			//写入换行符号
			out.newLine();
		}
		//5，关闭流
		out.close();
		in.close();
	}

}
