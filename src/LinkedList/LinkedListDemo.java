package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		//添加元素
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		//获取元素
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println("--------------------");
		//删除元素
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		System.out.println("--------------------");
		
		while(!link.isEmpty()){ //判断集合是否为空
			System.out.println(link.pop()); //弹出集合中的栈顶元素
       }

	}
	

}
