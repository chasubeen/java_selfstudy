public class ToStringEx {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString()���� �ڵ� ��ȯ
	}
}
