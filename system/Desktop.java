package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("DesktopSize");

	}

	public static void main(String[] args) {
		Desktop find = new Desktop();
		find.desktopSize();
		find.computerModel();

	}

}
