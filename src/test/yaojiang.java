package test;
import java.util.ArrayList;
import java.util.Random;;
public class yaojiang {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<7;i++) {
			Random ran=new Random();
			int ran1=ran.nextInt(33)+1;
			num.add(ran1);
			//System.out.println(ran1);
		}
		System.out.println("中奖号码为：");
        // 遍历ArrayList
        for (int i = 0; i < num.size() - 1; i++) {
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(i).equals(num.get(j))) {
                    num.remove(j);
                }
            }
        }
        for (int n : num) {
            System.out.println(n);
        }
    }
		
	

}
