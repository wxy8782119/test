package yuangonglei;
//在测试类中，创建JavaEE工程师对象，完成工作方法的调用
public class Test {
	public static void main(String[] args) {
		//创建JavaEE工程师员工对象，该员工的编号000015，员工的姓名 小明
		JavaEE ee = new JavaEE("000015", "小明");
		//调用该员工的工作方法
		ee.work();
	}
}

