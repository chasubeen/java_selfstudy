package innerclass;

class OutClass { // �ܺ� Ŭ����
	private int num = 10; // �ܺ� Ŭ���� private ����
	private static int sNum = 10; // �ܺ� Ŭ���� ���� ����

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}

		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}

	private InClass inClass; // ���� Ŭ���� �ڷ��� ������ ���� ����

	public OutClass() {
		inClass = new InClass();
	}

	class InClass { // �ν��Ͻ� ���� Ŭ����
		int inNum = 100; // ���� Ŭ������ �ν��Ͻ� ����

		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); // �ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ�������� ������ �� �ִ�.
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}
}

