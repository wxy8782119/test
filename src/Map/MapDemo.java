package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		function();
		function_1();
		function_2();
	}
	
	public static void function() {
		//创建Map对象
		Map<String, String> map = new HashMap<String,String>();
		//给map中添加元素
		map.put("星期一", "Monday");
		map.put("星期日", "Sunday");
		System.out.println(map); // {星期日=Sunday, 星期一=Monday}

		//当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
		System.out.println(map.put("星期一", "Mon")); // Monday
		System.out.println(map); // {星期日=Sunday, 星期一=Mon}

		//根据指定的key获取对应的value
		String en = map.get("星期日");
		System.out.println(en); // Sunday
		
		//根据key删除元素,会返回key对应的value值
		String value = map.remove("星期日");
		System.out.println(value); // Sunday
		System.out.println(map); // {星期一=Mon}
	}
	
	public static void function_1() {
		//创建Map对象
		Map<String, String> map = new HashMap<String,String>();
		//给map中添加元素
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		map.put("刘德华", "柳岩");
		//获取Map中的所有key
		Set<String> keySet = map.keySet();
		//遍历存放所有key的Set集合
		Iterator<String> it =keySet.iterator();
		while(it.hasNext()){
			//得到每一个key
			String key = it.next();
			//通过key获取对应的value
			String value = map.get(key);
			System.out.println(key+"="+value);
		}
	}
	
	public static void function_2() {
		//创建Map对象
		Map<String, String> map = new HashMap<String,String>();
		//给map中添加元素
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		map.put("刘德华", "柳岩");
		//获取Map中的所有key与value的对应关系
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		//遍历Set集合
		Iterator<Map.Entry<String,String>> it =entrySet.iterator();
		while(it.hasNext()){
			//得到每一对对应关系
			Map.Entry<String,String> entry = it.next();
			//通过每一对对应关系获取对应的key
			String key = entry.getKey();
			//通过每一对对应关系获取对应的value
			String value = entry.getValue();
			System.out.println(key+"="+value);
		}
	}

}
