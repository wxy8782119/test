package RrecursionMethod;

public class RecursionMethod
{
	//非递归方式实现计算“1+2+3+…+n”
	public int addNonrecursion(int n)
	{
		int result=0;
	
		for(int i=1;i<=n;++i)
		{
			result+=i;
		}
		return result;
	}

	//递归方式实现计算“1+2+3+…+n”
	public int addRecursion(int n)
	{
		//递归出口，当n小于1时函数就会逐层返回 
		if(n<=1)return n;
		return n+addRecursion(n-1);
	}

	public static void main(String[]args)
	{
		RecursionMethod test=new RecursionMethod();
		//调用非递归方法计算
		int result=test.addNonrecursion(10);
		System.out.println("非递归计算1+2+3+...+10结果："+result);
		//调用递归方法计算 
		result=test.addRecursion(10);
		System.out.println("递归计算1+2+3+...+10结果："+result);
	}
}
