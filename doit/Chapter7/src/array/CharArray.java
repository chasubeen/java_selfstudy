package array;

public class CharArray {
	public static void main(String[] args) {

		char[] alpahabets = new char[26];
		char ch = 'A';

		for (int i = 0; i < alpahabets.length; i++, ch++) {
			alpahabets[i] = ch; // �ƽ�Ű �ڵ� ������ �� ��ҿ� ����
		}

		for (int i = 0; i < alpahabets.length; i++) {
			System.out.println(alpahabets[i] + "," + (int) alpahabets[i]);
		}
	}
}
