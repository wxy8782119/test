package jiekou;
//鼠标实现USB规则
class Mouse implements USB {
	public void open() {
		System.out.println("鼠标开启");
	}

	public void close() {
		System.out.println("鼠标关闭");
	}
}
