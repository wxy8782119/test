package throwDemo;

public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
		//int[] arr = null;//传递数组不存在
		//int[] arr = {};//数组中没有任何元素
		int[] arr = {11,22};
		int i = getArray(arr);
		System.out.println(i);
	}

	private static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
		if(arr==null) {
			throw new NullPointerException("传递数组不存在");
		}
		if(arr.length==0) {
			throw new ArrayIndexOutOfBoundsException("数组中没有任何元素");
		}
		int i=arr.length;
		return i;
	}

}
