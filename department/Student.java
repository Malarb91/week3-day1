package org.department;

public class Student extends Department{

	public void studentName() {
		System.out.println("studentName");

	}
	public void studentDept() {
		System.out.println("studentDept");

	}
	public void studentId() {
		System.out.println("studentId");

	}
	public static void main(String[] args) {
		Student details = new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentId();
		details.studentDept();
		details.deptName();
		
	}

}
