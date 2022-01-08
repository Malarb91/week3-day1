package org.department;

public class Axisbank extends Bankinfo{

	public void fixedDeposit() {
		System.out.println("Overridden FIXED DEPOSIT");

	}
	public static void main(String[] args) {
		Axisbank details = new Axisbank();
		details.fixedDeposit();

	}

}
