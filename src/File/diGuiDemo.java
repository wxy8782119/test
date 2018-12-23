package File;

public class diGuiDemo {
	/*
	 *  方法的递归调用
	 *    方法自己调用自己
	 *  适合于,方法中运算的主体不变,但是运行的时候,参与运行的方法参数会变化
	 *  注意:
	 *     递归一定要有出口, 必须可以让程序停下
	 *     递归次数不能过多
	 *     构造方法,禁止递归
	 */
	public static void main(String[] args) {
		
		System.out.println(getSum(100));//计算 1+2+3+100和 = 5050
		
		System.out.println(getJieCheng(5));//计算阶乘 5!
		
		System.out.println(getFBNQ(12));//计算斐波那契数列
		
		
	}			
	/*
	 *  计算 1+2+3+100和 = 5050
	 *  计算规律:
	 *    n+(n-1)+(n-2)
	 *    100+(100-1)+(99-1)+...1
	 */
	public static int getSum(int n){
		if( n == 1)
			return 1;
		return n + getSum(n-1);
	}
	/* 
	 *  计算阶乘 5!
	 *   5*4*3*2*1
	 */
	public static int getJieCheng(int n){
		if( n == 1)
			return 1;
		return n * getJieCheng(n-1);
	}
	/*
	 *  方法递归,计算斐波那契数列
	 *  兔子问题：一对兔子，第一个月不生，第二个月不生，从第三个月开始
	 *  每个月生下一对兔子，生下的一对兔子，第一个月不生，第二个月不生，
	 *  从第三个月开始，每个月生下一对兔子
	 *  假设所有的兔子都不死，12个月，一共有多少对兔子？答案是144对
	 */
	public static int getFBNQ(int month){
		if( month == 1)
			return 1;
		if( month == 2)
			return 1;
		return getFBNQ(month-1)+getFBNQ(month-2);
	}
}
