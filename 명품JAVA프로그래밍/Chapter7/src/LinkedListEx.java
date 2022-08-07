import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		// 문자열만 삽입 가능한 LinkedList 컬렉션 생성
		LinkedList<String> list = new LinkedList<String>();
		
		// 키보드로부터 4개의 이름 입력받아 LinkedList에 삽입
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<4;i++) {
			System.out.println("Enter name>>"); // 키보드로부터 이름 입력
			String s = sc.next();
			list.add(s); // LinkedList 컬렉션에 삽입
		}
		
		// LinkedList에 들어있는 모든 이름 출력
		for(int i = 0;i<list.size();i++) {
			// LinkedList의 i번째 문자열 얻어오기
			String name = list.get(i);
			System.out.print(name + " ");
		}
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for(int i = 1;i<list.size();i++) {
			if(list.get(longestIndex).length()<list.get(i).length())
				longestIndex = i;
		}
		System.out.println("\nThe longest name: "+ list.get(longestIndex));
	}

}
