package arrayList;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언

	public Student(int studentID, String studentName) { // 생성자
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 할당
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // 과목 생성하기
		subject.setName(name); // 과목명 추가
		subject.setScorePoint(score); // 점수 추가
		subjectList.add(subject); // 배열 저장
	}

	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint(); // 총점 더하기
			System.out.println("학생 " + studentName + "의 " + s.getName() + 
					" 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
