package TryCatchFinallyDemo;
/*
 * try{
 * 		被检测的代码
 * 		可能出异常的代码
 * }catch（异常类名 变量）{
 * 		异常的处理方式
 * 		循环，判断，调用方法，变量
 * }finally{
 * 		必须要执行代码
 * }
 * finally无论程序是否有异常出现，程序必须执行
 */
public class ExceptionDemo {
	public static void function(int a) throws Exception {
		if(a==0)
			throw new Exception();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		try {
			function(0);
		}catch(Exception e) {
			System.out.println(e);
			//System.exit(0);
		}finally {
			System.out.println("代码必须执行");
		}
	}

}
