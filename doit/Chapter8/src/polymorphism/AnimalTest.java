package polymorphism;

import java.util.ArrayList;

class Animal_2 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human_2 extends Animal_2 {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger_2 extends Animal_2 {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle_2 extends Animal_2 {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal_2> aniList = new ArrayList<Animal_2>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 자료형으로 downcasting");
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
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

}
