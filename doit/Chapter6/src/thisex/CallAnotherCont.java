package thisex;

class Person2{
	String name;
	int age;
	
	Person2(){
		this("�̸� ����",1);
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
		
		Person2 p = noName.returnItSelf(); // this ���� Ŭ���� ������ �븳
		System.out.println(p); // noName.returnItSelf()�� ��ȯ�� ���
		System.out.println(noName); // ���� ���� ���
	}
}
