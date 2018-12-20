package test03.neibulei;

class Body {//外部类，身体
	private boolean life= true; //生命状态
    public class Heart { //内部类，心脏
    	public void jump() {
    		System.out.println("心脏噗通噗通的跳");
    		System.out.println("生命状态" + life); //访问外部类成员变量
    	}
    }
}