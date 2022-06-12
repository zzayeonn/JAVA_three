package ThirdPackage;

interface Predator { //인터페이스는 하나이기 때문에 클래스의 구현체와 상관없이 인터페이스를 기준으로 중요 클래스를 작성 
	String getFood(); //getFood 메소드의 구현체는 인터페이스를 implements한 클래스들이 구현 
}

class AnimalInterface {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends AnimalInterface implements Predator {
	public String getFood() { //인터페이스의 메소드는 항상 public으로 구현 
		return "apple";
	}
}

class Lion extends AnimalInterface implements Predator {
	public String getFood() {
		return "banana";
	}
}

//인터페이스를 사용하므로써 동물들의 종류에 의존적인 클래스에서 동물들의 종류와 상관없는 독립적인 클래스가 됨 
class Zookeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood()); //Predator 인터페이스를 구현한 구현체(Tiger, Lion)의 getFood() 메소드 호출 
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger(); //Tiger 클래스의 객체, Predator 인터페이스의 객체 
		Lion lion = new Lion(); //Lion 클래스의 객체, Predator 인터페이스의 객체 
		zookeeper.feed(tiger);
		zookeeper.feed(lion);

	}

}
