package throwDemo;

public class ExceptionDemo1 {
	public static void main(String[] args) throws Exception {
		//int[] arr = null;//传递数组不存在
		//int[] arr = {};//数组中没有任何元素
		int[] arr = {11,22};
		int i = getArray(arr);
		System.out.println(i);
	}

	private static int getArray(int[] arr) throws Exception {
		if(arr==null) {
			throw new Exception("传递数组不存在");
		}
		if(arr.length==0) {
			throw new Exception("数组中没有任何元素");
		}
		int i=arr.length;
		return i;
	}

}
