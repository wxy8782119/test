package test;

class Fu {
	int num = 4;
	void show()	{
		System.out.println("Fu show num");
	}
}
class Zi extends Fu {
	int num = 5;
	void show()	{
		System.out.println("Zi show num");
	}
}
class Demo {
	public static void main(String[] args) 	{
		Fu f = new Zi();
		f.show();
		//编译看左边，运行看右边。
		
		System.out.println(f.num);
		//编译和运行都参考等号的左边。编译运行看左边。
		
		Fu fu =new Fu();
		fu.show();
		
		Zi z =new Zi();
		System.out.println(z.num);
	}
}


