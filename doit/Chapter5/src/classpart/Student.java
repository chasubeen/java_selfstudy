package classpart;

public class Student {
	// ��� ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// �޼ҵ�(��� �Լ�)
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); // ��ü ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
