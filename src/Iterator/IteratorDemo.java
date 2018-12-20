package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        //迭代器,对集合ArrayList中的元素进行取出
        
        //调用集合的方法iterator()获取出,Iterator接口的实现类的对象
        Iterator<String> it = coll.iterator();
        //接口实现类对象,调用方法hasNext()判断集合中是否有元素
        //boolean b = it.hasNext();
        //System.out.println(b);
        //接口的实现类对象,调用方法next()取出集合中的元素
        //String s = it.next();
        //System.out.println(s);
        
        //迭代是反复内容,使用循环实现,循环的条件,集合中没元素, hasNext()返回了false
        while(it.hasNext()){
          String s = it.next();
          System.out.println(s);
        }
        System.out.println("-------------------");
        
        function_1();
        function();
        function_2();
      }
	
	/*
     *  JDK1.5新特性,增强for循环
     *  JDK1.5版本后,出现新的接口 java.lang.Iterable
     *    Collection开是继承Iterable
     *    Iterable作用,实现增强for循环
     *    
     *    格式:
     *      for( 数据类型  变量名 : 数组或者集合 ){
     *         sop(变量);
     *      }
     */
    public static void function_1(){
       //for对于对象数组遍历的时候,能否调用对象的方法呢
       String[] str = {"abc","itcast","cn"};
       for(String s : str){
         System.out.println(s.length());
       }
       System.out.println("-------------------");
     }
    
    /*
     *  实现for循环,遍历数组
     *  好处: 代码少了,方便对容器遍历
     *  弊端: 没有索引,不能操作容器里面的元素
     */
    public static void function(){
      int[] arr = {3,1,9,0};
      for(int i : arr){
        System.out.println(i+1);
      }
      System.out.println(arr[0]);
    }
    
    /*
     *  增强for循环遍历集合
     *  存储自定义Person类型
     */
    public static void function_2(){
      ArrayList<Person> array = new ArrayList<Person>();
      array.add(new Person("a",20));
      array.add(new Person("b",10));
      for(Person p : array){
        System.out.println(p);// System.out.println(p.toString());
      }
    }

}
