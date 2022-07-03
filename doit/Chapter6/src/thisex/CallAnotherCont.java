package thisex;

class Person2{
	String name;
	int age;
	
	Person2(){
		this("이름 없음",1);
	}
	Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	Person2 returnItSelf() {
		return this;
	}
}

public class CallAnotherCont {
	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person2 p = noName.returnItSelf(); // this 값을 클래스 변수에 대립
		System.out.println(p); // noName.returnItSelf()의 반환겂 출력
		System.out.println(noName); // 참조 변수 출력
	}
}
