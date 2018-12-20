package test;
import java.util.ArrayList;
public class test00 {
	
	public static void main(String[] args){
		ArrayList<String> name=new ArrayList<String>();
		name.add("wang");
		name.add("xiang");
		for(int i=0;i<name.size();i++) {
			String n=name.get(i);
			System.out.println(n);
		}
	}
	
}
