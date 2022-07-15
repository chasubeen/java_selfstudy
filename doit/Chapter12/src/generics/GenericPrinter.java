package generics;

public class GenericPrinter<T extends Material> { // 사용할 수 있는 자료형에 제한 두기
	private T material; // T 자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
