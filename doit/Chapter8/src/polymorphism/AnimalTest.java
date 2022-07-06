package polymorphism;

import java.util.ArrayList;

class Animal_2 {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human_2 extends Animal_2 {
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger_2 extends Animal_2 {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle_2 extends Animal_2 {
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	ArrayList<Animal_2> aniList = new ArrayList<Animal_2>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� �ڷ������� downcasting");
		aTest.testCasting();
	}

	public void addAnimal() {
		aniList.add(new Human_2());
		aniList.add(new Tiger_2());
		aniList.add(new Eagle_2());
		
		for(Animal_2 ani : aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		for(int i = 0;i<aniList.size();i++) {
			Animal_2 ani = aniList.get(i);
			if(ani instanceof Human_2) {
				Human_2 h = (Human_2)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger_2) {
				Tiger_2 t = (Tiger_2)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle_2) {
				Eagle_2 e = (Eagle_2)ani;
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}

}
