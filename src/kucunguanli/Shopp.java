package kucunguanli;
import java.util.Scanner;
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
		//品牌型号
		String[] brands = new String[]{"MacBookAir", "ThinkpadT450"};
		//尺寸大小
		double[] sizes = new double[]{13.3, 14.0};
		//价格
		double[] prices = new double[]{6988.88, 5999.99};
		//库存个数
		int[] counts = new int[]{0, 0};
		
		//通过while循环模拟管理员进行功能重复选择操作
		while (true) {
			//打印功能菜单操作,接收键盘输入的功能选项序号
			int choose = chooseFunction();
			//执行序号对应的功能
			switch (choose) {
			case 1://查看库存清单
				printStore(brands, sizes, prices, counts);
				break;
			case 2://修改商品库存数量
				update(brands, counts);
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
	 * 查看库存清单
	 * @param brands 商品品牌型号
	 * @param sizes 商品尺寸大小	
	 * @param prices 商品价格
	 * @param counts 商品库存个数
	 */
	public static void printStore(String[] brands, double[] sizes, double[] prices, int[] counts) {
		//统计总库存个数、统计库存总金额
		int totalCount = 0;
		double totalMoney = 0.0;
		for (int i = 0; i < brands.length; i++) {
			totalCount += counts[i];
			totalMoney += counts[i] * prices[i];
		}
		//列表顶部
		System.out.println("---------------------------查看库存清单--------------------------");
		System.out.println("品牌型号		尺寸	价格	库存数");
		//列表中部
		for (int i = 0; i < brands.length; i++) {
			System.out.println(brands[i]+"	"+sizes[i]+"	"+prices[i]+"	"+counts[i]);
		}
		//列表底部
		System.out.println("-------------------------------------------------------------");
		System.out.println("总库存数："+totalCount); 
		System.out.println("库存商品总金额："+totalMoney);
	}
	/**
	 * 修改商品库存数量
	 * @param brands 商品品牌型号
	 * @param counts 商品库存个数
	 */
	public static void update(String[] brands, int[] counts){
		System.out.println("------------修改商品库存数量-----------");
		for (int i = 0; i < brands.length; i++) {
			System.out.println("请输入"+ brands[i] +"商品库存数");
			counts[i] = new Scanner(System.in).nextInt();
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
