package TryCatchFinallyDemo1;

public class Person {
	private String name;
	private int age;
	Person(String name,int age) throws NoAgeException{
		//加入逻辑判断
		if(age<0||age>200) {
			throw new NoAgeException(age+"是年龄数值非法");
		}
		this.name = name;
		this.age = age;
	}
	//定义Person对象对应的字符串表现形式。覆盖Object中的toString方法。
	public String toString()	{
		return "姓名="+name+",年龄="+age;
	}


}
