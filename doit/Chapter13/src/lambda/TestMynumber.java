package lambda;

public class TestMynumber {
	public static void main(String[] args) {
		MyNumber max = (x,y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10,20));
	}
}
