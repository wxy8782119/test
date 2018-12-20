package TryCatchFinallyDemo1;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Person p = new Person("小明",-20);
			System.out.println(p);
		} catch (NoAgeException e) {
			e.printStackTrace();
		}
		

	}

}
