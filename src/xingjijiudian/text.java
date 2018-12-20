package xingjijiudian;

public class text {
	public static void main(String[] args) {
		FuWuYuan fuwuyuan =new FuWuYuan("王先生","1231321");
		System.out.println("工号："+fuwuyuan.getGongHao());
		System.out.print(fuwuyuan.getXingMing());
		fuwuyuan.server();
		fuwuyuan.work();
		System.out.println("--------------------------");
		
		ChuShi chushi =new ChuShi("宋先生", "5749879");
		System.out.println("工号："+chushi.getGongHao());
		System.out.print(chushi.getXingMing());
		chushi.server();
		chushi.work();
		System.out.println("--------------------------");
		
		JingLi jingli =new JingLi("高先生", "1234565", 33.3);
		System.out.println("工号："+jingli.getGongHao());
		System.out.print(jingli.getXingMing()+"问：");
		jingli.work();
		System.out.println("扣钱："+jingli.getJiangJin());
		System.out.println("--------------------------");
	}
}
