import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		
		// ���ڿ��� ���� ������ ArrayList �÷��� �����ϱ�
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("Java");
		System.out.println("Size: "+a.size());
		
		a.add(2,"Sahni"); // 2�� ��ġ�� ��� ����
		System.out.println(a); // a.toString() �ڵ� ȣ��
		
		a.set(2, "James"); // 2�� ��ġ ��� ����
		System.out.println(a);
		
		String str = a.get(1);
		System.out.println(str);
		
		a.remove(1);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
	}
}
