package classpart;

public class Student {
	// 멤버 변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메소드(멤버 함수)
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // 객체 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
