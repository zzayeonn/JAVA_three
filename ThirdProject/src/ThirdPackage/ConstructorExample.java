package ThirdPackage;

class AnimalConstructor {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class DogConstructor extends AnimalConstructor {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDogConstructor extends DogConstructor { 
	HouseDogConstructor(String name){ //생성자 : 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드(void도 미사용)
		this.setName(name);
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		HouseDogConstructor dog = new HouseDogConstructor("happy"); //객체가 생성될 때 생성자 호출 
		System.out.println(dog.name);
	}

}
