package lei;

public class usingAttribute 
{
	static String a="string-a";
	static String b;
	
	String c="string-c";
	String d;
	//static语句块用于初始化static成员变量，是最先运行的语句块
	static
	{
		printStatic("before static");
		b="string-b";
		printStatic("after static");	
	}
	//输出静态成员标量
	public static void printStatic(String title)
	{
		System.out.println("----------"+title+"----------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");		
	}
	
	public usingAttribute()
	{
		print("before constructor");
		d="string-d";
		print("after constructor");
	}
	
	//打印所有属性，包括静态成员
	public void print(String title)
	{
		System.out.println("----------"+title+"----------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
		System.out.println("c=\""+c+"\"");
		System.out.println("d=\""+d+"\"");
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("----------创建usingAttribute对象--------------");
		System.out.println();
		new usingAttribute();
	}

}
