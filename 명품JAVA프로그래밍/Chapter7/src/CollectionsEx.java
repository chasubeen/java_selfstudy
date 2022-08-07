import java.util.*;

public class CollectionsEx {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Transformer");
		myList.add("Starwars");
		myList.add("Matrix");
		myList.add(0,"Terminator");
		myList.add(2,"Avatar");
		System.out.println(myList);
		
		Collections.sort(myList); // 요소 정렬
		System.out.println(myList);
		
		int index = Collections.binarySearch(myList, "Starwars");
		System.out.println("Starwars is at " + index);
		
		Collections.reverse(myList); // 요소의 순서를 반대로
		System.out.println(myList);
	}
}
