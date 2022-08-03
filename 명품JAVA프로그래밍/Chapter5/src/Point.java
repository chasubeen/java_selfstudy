class Point {
	private int x,y; // 한 점을 구성하는 x,y 좌표
	public Point() {
		this.x = x;this.y = y;
	}
	public Point(int x,int y) {
		this.x = x;this.y = y;
	}
	
	public void set(int x,int y) {
		this.x = x;this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
