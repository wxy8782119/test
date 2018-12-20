package TryCatchFinallyDemo;
/*
 * 自定义异常
 * 	继承Exception或者继承RuntimeException
 */
public class FushuException extends RuntimeException{
	public FushuException(String s) {
		super(s);
	}
}
