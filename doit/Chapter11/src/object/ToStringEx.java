package object;

class Book{
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
	Book book1 = new Book(200, "개미");
	
	System.out.println(book1); // 인스턴스 정보(클래스 이름.주소 값)
	System.out.println(book1.toString()); // 메서드를 이용해 인스턴스 정보를 보여 줌
	}
}

