package jiekou;
//键盘实现USB规则
class KeyBoard implements USB {
	public void open() {
		System.out.println("键盘开启");
	}

	public void close() {
		System.out.println("键盘关闭");
	}
}
