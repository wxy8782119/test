package jiekou;
//定义笔记本
class NoteBook {
	// 笔记本开启运行功能
	public void run() {
		System.out.println("笔记本运行");
	}

	// 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
	public void useUSB(USB usb) {
		// 判断是否有USB设备
		if (usb != null) {
			usb.open();
			usb.close();
		}
	}

	public void shutDown() {
		System.out.println("笔记本关闭");
	}
}

