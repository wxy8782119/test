package jicheng;
//在测试类中，创建JavaEE工程师对象，完成工作方法的调用
public class Test {
	public static void main(String[] args) {
		//创建JavaEE工程师员工对象
		JavaEE ee = new JavaEE();
		//设置该员工的编号
		ee.setId("00001566");
		//设置该员工的姓名
		ee.setName("小明");
		//调用该员工的工作方法
		ee.work();
		
		Android ad = new Android();
		ad.setId("00013213");
		ad.setName("小红");
		ad.work();
		
		Network nw = new Network();
		nw.setId("00022222");
		nw.setName("小样"); 
		nw.work();
		
		Hardware hw = new Hardware();
		hw.setId("00055555");
		hw.setName("小宝");
		hw.work();
	}
}

