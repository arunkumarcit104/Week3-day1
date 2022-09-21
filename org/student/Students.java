package org.student;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println(id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+ " "+ name);
		
	}
	public void getStudentInfo(int id,String name,String email) {
		
		System.out.println(id +" "+ name+" " + email);
		
	}
	public void getStudentInfo(int id,String name,String email,int phoneNumber) {
		
		System.out.println(id+ " " + name +"  " + email +" "
				+ "" + phoneNumber);
	}


	public static void main(String[] args) {
		Students studentInfo=new Students();
		
		studentInfo.getStudentInfo(104);
		
		studentInfo.getStudentInfo(105, "Arun");
		
		studentInfo.getStudentInfo(106, "Taj", "abc@gmail.com");
		
		studentInfo.getStudentInfo(106, "Vivk", "Vick@hotmail.com", 813486793);
		
	}
}
