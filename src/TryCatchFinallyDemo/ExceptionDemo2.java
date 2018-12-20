package TryCatchFinallyDemo;

public class ExceptionDemo2 {
	public static void function() {
		int[] arr= {1,2,3};
		if(arr[5]>100) {
			arr[5]=arr[5]/2;
		}else {
			arr[5]=arr[5]/3;
		}
	}
	
	public static double getArea(double r) {
		if(r<=0) {
			throw new RuntimeException("圆形不存在");
		}
		return r*r*Math.PI;
	}
	
	public static void main(String[] args) {
		//function();
		double d=getArea(-1);
		System.out.println(d);
	}

}
