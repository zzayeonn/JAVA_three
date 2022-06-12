package ThirdPackage;

//다형성 : 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것, 복잡한 형태의 분기문을 간단하게 처리할 수 있음 
interface PredatorPolymor { 
	String getFood(); 
}

//Barkable 인터페이스 추가
interface Barkable {
	void bark();
}

//인터페이스는 일반 클래스와 달리 extends를 이용하여 여러개의 인터페이스를 동시에 상속 가능, 다중 상속 지원 
interface BarkablePredator extends PredatorPolymor, Barkable { //자식 클래스의 객체 자료형을 부모 클래스의 자료형으로 사용 가능 
	
}

class AnimalPolymor {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class TigerPolymor extends AnimalPolymor implements PredatorPolymor, Barkable { //,를 이용해 여러 개를 implements 가능 
	public String getFood() { 
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}

class LionPolymor extends AnimalPolymor implements BarkablePredator { //일반 클래스는 단일상속만 가능 
	public String getFood() {
		return "banana";
	}
	public void bark() {
		System.out.println("으르렁");
	}
}

class ZookeeperPolymor {
	void feed(PredatorPoly predator) { //PredatorPoly로 선언된 predator 객체는 getFood 메소드만 호출 가능 
		System.out.println("feed " + predator.getFood()); 
	}

}

class Bouncerpolymor {
	void barkAnimal(Barkable animal) { //Barkable로 선언된 animal 객체는 bark 메소드만 호출 가능 
		animal.bark();
	}
}

public class PolymorphismExample2 {

	public static void main(String[] args) {
		TigerPolymor tiger = new TigerPolymor(); 
		LionPolymor lion = new LionPolymor(); 
		Bouncerpolymor bouncer = new Bouncerpolymor();
		bouncer.barkAnimal(tiger); 
		bouncer.barkAnimal(lion);
		
		/*TigerPolymor tiger = new TigerPolymor(); //TigerPolymor is a TigerPolymor
		AnimalPolymor animal = new TigerPolymor(); //TigerPolymor is a AnimalPolymor
		PredatorPolymor predator = new TigerPolymor(); //TigerPolymor is a PredatorPolymor
		BarkablePolymor barkable = new TigerPolymor(); //TigerPolymor is a BarkablePolymor*/
	}

}

