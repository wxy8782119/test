package TryCatchFinallyDemo;

public class ExceptionDemo3 {
	/*
	 *  * a：getMessage()方法
			返回该异常的详细信息字符串，即异常提示信息
			如：异常了！
		* b：toString()方法
			返回该异常的名称与详细信息字符串
			如：java.lang.Exception: 异常了！
		* c：printStackTrace()方法
			在控制台输出该异常的名称与详细信息字符串、异常出现的代码位置
			如：java.lang.Exception: 异常了！
	at TryCatchFinallyDemo.ExceptionDemo3.function(ExceptionDemo3.java:15)
	at TryCatchFinallyDemo.ExceptionDemo3.main(ExceptionDemo3.java:20)

	 */
	public static void function() throws Exception {
		throw new Exception("异常了！");
	}
	
	public static void main(String[] args) {
		try {
			function();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("---------------getMessage()方法-----------------");
			System.out.println(e.toString());
			System.out.println("--------------toString()方法------------------");
			e.printStackTrace();
			System.out.println("--------------printStackTrace()方法------------------");
		}
		
	}

}
