import java.util.*;

public class HashMapStudentEx {
	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		// 3명의 학생 저장
		map.put("김사과", new Student(1,"010-111-1111"));
		map.put("반하나", new Student(2,"010-222-2222"));
		map.put("박수박", new Student(3,"010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름? ");
			String name = sc.nextLine(); // 사용자로부터 이름 입력
			if(name.equals("exit"))
				break; // exit을 입력하면 프로그램 종료
			Student student = map.get(name); // 이름에 해당하는 Student 객체 검색
			if(student == null)
				System.out.println(name+"은 없는 사람입니다.");
			else
				System.out.println("id" + student.id + ",전화"+student.tel);
		}
		sc.close();
	}
}
