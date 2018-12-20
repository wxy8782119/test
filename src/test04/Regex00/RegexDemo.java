package test04.Regex00;

public class RegexDemo {
	public static void main(String[] args) {
		
		checkTel();
		checkQQ();
	}
	
	/*
	 *  检查手机号码是否合法
	 *  1开头 可以是34578  0-9 位数固定11位
	 */
	public static void checkTel(){
		String telNumber = "18651280005";
		//String类的方法matches
		boolean b = telNumber.matches("1[34857][\\d]{9}");
		//[\\d]代表的是 0到9数字，两头的数字包括在内，相当于[0-9]
		System.out.println(b);
	}
	
	/*
	 *  检查QQ号码是否合法
	 *  0不能开头,全数字, 位数5,10位
	 *  123456 
	 *  \\d  \\D匹配不是数字
	 */
	public static void checkQQ(){
		String QQ = "1234567";
		//检查QQ号码和规则是否匹配,String类的方法matches
		boolean b = QQ.matches("[1-9][\\d]{4,9}");
		System.out.println(b);
	}

}
