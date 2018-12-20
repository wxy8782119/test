package TryCatchFinallyDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
	public static void function() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse("2088-8-8");
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		try {
			function();
		}catch(ParseException e) {
			
		}
	}

}
