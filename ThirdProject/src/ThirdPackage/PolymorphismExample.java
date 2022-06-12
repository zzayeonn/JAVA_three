package ThirdPackage;

interface PredatorPoly { 
	String getFood(); 
}

class AnimalPoly {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class TigerPoly extends AnimalPoly implements PredatorPoly {
	public String getFood() { 
		return "apple";
	}
}

class LionPoly extends AnimalPoly implements PredatorPoly {
	public String getFood() {
		return "banana";
	}
}

class ZookeeperPoly {
	void feed(PredatorPoly predator) {
		System.out.println("feed " + predator.getFood()); 
	}

}

class Bouncer {
	void barkAnimal(AnimalPoly animal) {
		if(animal instanceof TigerPoly) { //instanceof : 어떤 객체가 특정 클래스의 객체인지 조사할 때 사용되는 자바의 내장 명령어 
			System.out.println("어흥");
		} else if(animal instanceof LionPoly) { //animal 객체는 LionPoly 클래스로 만들어진 객체인가? 
			System.out.println("으르렁");
		}
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {
		TigerPoly tiger = new TigerPoly(); 
		LionPoly lion = new LionPoly(); 

		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger); 
		bouncer.barkAnimal(lion);
		
		//barkAnimal 메소드의 입력자료형은 Tiger나 Lion이 아닌 Animal
		//하지만 barkAnimal 메소드를 호출할 때는 tiger 또는 lion 객체를 전달 가능 
		//Tiger, Lion 클래스가 Animal이라는 부모 클래스를 상속한 자식 클래스이기 때문 
		//자식 클래스에 의해서 만들어진 객체는 언제나 부모 클래스의 자료형으로 사용 가능(IS-A 관계)
		/*AnimalPoly tiger = new TigerPloy(); //TigerPoly is a AnimalPoly
		AnimalPoly lion = new LionPoly(); //LionPoly is a AnimalPoly*/
	}

}

