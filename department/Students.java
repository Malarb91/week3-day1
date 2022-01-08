package org.department;

public class Students {
	public void getStudentInfo(int ID) {
		
System.out.println(ID);
	}

public void getStudentInfoName(int ID, String name) {
	System.out.println(ID + "Name");

}
public void getStudentInfoName(String Email) {
	System.out.println( Email);

}

	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(1);
		details.getStudentInfoName("Malarvb@gmail.com");
				details.getStudentInfoName(123, "Malar");

	}

}
