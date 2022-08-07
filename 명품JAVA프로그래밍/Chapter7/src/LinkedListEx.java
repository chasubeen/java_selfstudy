import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		// ���ڿ��� ���� ������ LinkedList �÷��� ����
		LinkedList<String> list = new LinkedList<String>();
		
		// Ű����κ��� 4���� �̸� �Է¹޾� LinkedList�� ����
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<4;i++) {
			System.out.println("Enter name>>"); // Ű����κ��� �̸� �Է�
			String s = sc.next();
			list.add(s); // LinkedList �÷��ǿ� ����
		}
		
		// LinkedList�� ����ִ� ��� �̸� ���
		for(int i = 0;i<list.size();i++) {
			// LinkedList�� i��° ���ڿ� ������
			String name = list.get(i);
			System.out.print(name + " ");
		}
		// ���� �� �̸� ���
		int longestIndex = 0;
		for(int i = 1;i<list.size();i++) {
			if(list.get(longestIndex).length()<list.get(i).length())
				longestIndex = i;
		}
		System.out.println("\nThe longest name: "+ list.get(longestIndex));
	}

}
