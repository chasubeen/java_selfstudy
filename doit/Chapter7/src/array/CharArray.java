package array;

public class CharArray {
	public static void main(String[] args) {

		char[] alpahabets = new char[26];
		char ch = 'A';

		for (int i = 0; i < alpahabets.length; i++, ch++) {
			alpahabets[i] = ch; // 아스키 코드 값으로 각 요소에 저장
		}

		for (int i = 0; i < alpahabets.length; i++) {
			System.out.println(alpahabets[i] + "," + (int) alpahabets[i]);
		}
	}
}
