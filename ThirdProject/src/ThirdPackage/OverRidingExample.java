package ThirdPackage;

//메소드 오버라이딩 : 부모클래스의 메소드를 자식클래스가 동일한 형태로 다시 구현하는 행위 = 메소드 덮어쓰기 
class AnimalRiding {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class DogRiding extends AnimalRiding { 
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends DogRiding { //DogRiding 메소드를 구체화 시킴 
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
}

public class OverRidingExample {

	public static void main(String[] args) {
		HouseDog housedog = new HouseDog(); //= Object dog = new Dog(); = Dog is a Object
		housedog.setName("happy");
		housedog.sleep(); //HouseDog 클래스의 sleep 메소드가 Dog 클래스의 sleep 메소드보다 더 높은 우선순위를 가짐

	}

}
