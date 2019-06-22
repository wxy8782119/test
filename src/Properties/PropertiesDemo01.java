package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
	public static void main(String[] args) throws IOException {
		//function_1();
		//function_2();
		function_3();
	}
	
	/*
	 * 
	 * Properties集合，它是唯一一个能与IO流交互的集合
	 * 
	 * 需求：向Properties集合中添加元素，并遍历
	 * 
	 * 方法：
	 * public Object setProperty(String key, String value)调用 Hashtable 的方法 put。
	 * public Set<String> stringPropertyNames()返回此属性列表中的键集，
	 * public String getProperty(String key)用指定的键在此属性列表中搜索属性
	 */
	public static void function_1() {
		//创建集合对象
		Properties prop = new Properties();
		//添加元素到集合
		//prop.put(key, value);
		prop.setProperty("周迅", "张学友");
		prop.setProperty("李小璐", "贾乃亮");
		prop.setProperty("杨幂", "刘恺威");
		
		//System.out.println(prop);//测试的使用
		//遍历集合
		Set<String> keys = prop.stringPropertyNames();
		for (String key : keys) {
			//通过键 找值
			//prop.get(key);
			String value = prop.getProperty(key);
			System.out.println(key+"==" +value);
		}
	}
	
	/*
	 * 		将集合中内容存储到文件
	 * 
	 * 需求：使用Properties集合，完成把集合内容存储到IO流所对应文件中的操作
	 * 分析：
	 * 1，创建Properties集合
	 * 2，添加元素到集合
	 * 3，创建流
	 * 4，把集合中的数据存储到流所对应的文件中
	 * stroe(Writer,comments)
	 * store(OutputStream,commonts)
	 * 把集合中的数据，保存到指定的流所对应的文件中，参数commonts代表对描述信息
	 * 5，关闭流
	 */
	public static void function_2() throws IOException {
		//1，创建Properties集合
		Properties prop = new Properties();
		//2，添加元素到集合
		prop.setProperty("周迅", "张学友");
		prop.setProperty("李小璐", "贾乃亮");
		prop.setProperty("杨幂", "刘恺威");
		//3，创建流
		FileWriter out = new FileWriter("E:\\java作业\\Test\\src\\Properties\\prop.properties");
		//4，把集合中的数据存储到流所对应的文件中
		prop.store(out, "save data");
		//5，关闭流
		out.close();
	}
	
	/*	
	 *	     读取文件中的数据，并保存到集合
	 * 
	   * 需求：从属性集文件prop.properties 中取出数据，保存到集合中
	   *分析：
	 *1，创建集合
	 *2，创建流对象
	 *3,把流所对应文件中的数据 读取到集合中
	 *load(InputStream)  把指定流所对应的文件中的数据，读取出来，保存到Propertie集合中
			load(Reader)  
	 *4,关闭流
	 *5,显示集合中的数据
	 *
	 * Properties集合特有方法load
	 * load(InputStream in)
	 * load(Reader r)
	 * 传递任意的字节或者字符输入流
	 * 流对象读取文件中的键值对，保存到集合*/
	public static void function_3() throws IOException{
		//1，创建Properties集合
		Properties prop = new Properties();
		//2，创建流对象
		//FileInputStream in = new FileInputStream("prop.properties");
		FileReader fr =new FileReader("E:\\java作业\\Test\\src\\Properties\\prop.properties");
		//调用集合的方法load，传递字符输入流
		//3,把流所对应文件中的数据 读取到集合中
		prop.load(fr);
		//4,关闭流
		fr.close();
		//5,显示集合中的数据
		System.out.println(prop);
		//注意：使用字符流FileReader就可以完成文件中的中文读取操作了
	}
	

}
