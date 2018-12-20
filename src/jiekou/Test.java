package jiekou;

public class Test {
	public static void main(String[] args) {
		// 创建笔记本实体对象
		NoteBook nb = new NoteBook();
// 笔记本开启
		nb.run();

		// 创建鼠标实体对象
		Mouse m = new Mouse();
		// 笔记本使用鼠标
		nb.useUSB(m);

// 创建键盘实体对象
		KeyBoard kb = new KeyBoard();
		// 笔记本使用键盘
		nb.useUSB(kb);

		// 笔记本关闭
		nb.shutDown();
	}
}
