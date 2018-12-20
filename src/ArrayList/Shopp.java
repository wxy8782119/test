package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Shopp {
	/**
	 * 库存管理功能菜单
	 * @return 管理员键盘输入的功能操作序号 
	 */
	public static int chooseFunction() {
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		//接收键盘输入的功能选项序号
		Scanner sc = new Scanner(System.in); 
		int choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		//记录库存商品信息
		ArrayList<Goods> list = new ArrayList<Goods>();
		//添加商品到库存
		addStore(list);
		
		//通过while循环模拟管理员进行功能重复选择操作
		while (true) {
			//打印功能菜单操作,接收键盘输入的功能选项序号
			int choose = chooseFunction();
			//执行序号对应的功能
			switch (choose) {
			case 1://查看库存清单
				printStore(list);
				break;
			case 2://修改商品库存数量
				update(list);
				break;
			case 3://退出
				exit();
				return;
			default:
				System.out.println("----------------------------------");
				System.out.println("功能选择有误，请输入正确的功能序号!");
				break;
			}
		}
	}
	/**
	 * 添加商品到库存
	 */
	public static void addStore(ArrayList<Goods> list) {
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		g1.brand = "MacBook";
		g1.size = 13.3;
		g1.price = 9999.99;
		g1.count = 3;
		
		g2.brand = "Thinkpad";
		g2.size = 15.6;
		g2.price = 7999.99;
		g2.count = 1;
		
		//Goods类型的变量,存储到集合中
		list.add(g1);
		list.add(g2);
	}
	/**
	 * 查看库存清单
	 */
	public static void printStore(ArrayList<Goods> list) {
		//统计总库存个数、统计库存总金额
		int totalCount = 0;
		double totalMoney = 0.0;
		//列表顶部
		System.out.println("---------------------------查看库存清单--------------------------");
		System.out.println("品牌型号		尺寸	价格	库存数");
		//列表中部
		for (int i = 0; i < list.size(); i++) {
			Goods item = list.get(i);
			System.out.println(item.brand+"	"+item.size+"	"+item.price+"	"+ item.count);
			//统计总库存个数、统计库存总金额
			totalCount += item.count;
			totalMoney += item.count * item.price;
		}
		//列表底部
		System.out.println("-------------------------------------------------------------");
		System.out.println("总库存数："+totalCount); 
		System.out.println("库存商品总金额："+totalMoney);
	}
	/**
	 * 修改商品库存数量
	 */
	public static void update(ArrayList<Goods> list){
		System.out.println("------------修改商品库存数量-----------");
		for (int i = 0; i < list.size(); i++) {
			Goods item = list.get(i);
			System.out.println("请输入"+ item.brand +"商品库存数量");
			item.count = new Scanner(System.in).nextInt();
			list.set(i, item);
		}
	}
	/**
	 * 退出
	 */
	public static void exit(){
		System.out.println("----------------退出---------------");
		System.out.println("您已退出系统");
	}






}		
