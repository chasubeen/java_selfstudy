interface PhoneInterface {
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall();
	default void printLogo() {
		System.out.println(" ** Phone ** ");
	}
}
