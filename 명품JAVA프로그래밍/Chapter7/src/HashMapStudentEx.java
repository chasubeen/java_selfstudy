import java.util.*;

public class HashMapStudentEx {
	public static void main(String[] args) {
		// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ����
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		// 3���� �л� ����
		map.put("����", new Student(1,"010-111-1111"));
		map.put("���ϳ�", new Student(2,"010-222-2222"));
		map.put("�ڼ���", new Student(3,"010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�? ");
			String name = sc.nextLine(); // ����ڷκ��� �̸� �Է�
			if(name.equals("exit"))
				break; // exit�� �Է��ϸ� ���α׷� ����
			Student student = map.get(name); // �̸��� �ش��ϴ� Student ��ü �˻�
			if(student == null)
				System.out.println(name+"�� ���� ����Դϴ�.");
			else
				System.out.println("id" + student.id + ",��ȭ"+student.tel);
		}
		sc.close();
	}
}
