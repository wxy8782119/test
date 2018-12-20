package throwDemo;

public class ExceptionDemo {
	public static void main(String[] args) {
		int[] arr = {34,12,67}; //创建数组
		int num = getElement(null, 2);// 调用方法，获取数组中指定索引处元素
		//int num = ArrayTools.getElement(arr,5);// 调用方法，获取数组中指定索引处元素
		System.out.println("num="+num);//打印获取到的元素值
	}
	
	//通过给定的数组，返回给定的索引对应的元素值。
	public static int getElement(int[] arr,int index){
	/*
	若程序出了异常，JVM它会打包异常对象并抛出。但是它所提供的信息不够给力。想要更清晰，需要自己抛出异常信息。
	下面判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
	*/
		if(arr==null){
			throw new NullPointerException("arr指向的数组不存在");
		}
		if(index<0 || index>=arr.length){
			throw new ArrayIndexOutOfBoundsException("错误的角标，"+index+"索引在数组中不存在");
		}
		int element = arr[index];
		return element;
	}
}
