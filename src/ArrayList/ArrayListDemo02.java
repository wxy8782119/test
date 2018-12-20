package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo02 {
	public static void main(String[] args) {
		 //创建ArrayList集合
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 //添加元素到集合
		 list.add(13);
		 list.add(15);
		 list.add(22);
		 list.add(29);
		 //遍历集合
		 for (int i = 0; i < list.size() ; i++) {
		 //通过索引，获取到集合中每个元素
		 int n = list.get(i) ;
		 System.out.println(n);
		 }
		 
		 //ArrayList集合存储5个Person类型元素
		 ArrayList<Person> list1 = new ArrayList<Person>();
         list1.add(new Person("小强",21,321321321));
         list1.add(new Person("老王",22,165986511));
         list1.add(new Person("小虎",23,456789756));
         list1.add(new Person("小泽",24,468465461));
         list1.add(new Person("小红",25,948435413));
         for(int i=0; i<list1.size(); i++){
           Person p = list1.get(i);
                 System.out.println(p);
          }
	}
}
