interface PhoneInterface {
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall();
	default void printLogo() {
		System.out.println(" ** Phone ** ");
	}
}
