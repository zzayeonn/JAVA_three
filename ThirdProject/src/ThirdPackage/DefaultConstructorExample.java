package ThirdPackage;

class AnimalDefault { //= class Animals extends Object, 모든 클래스는 Object 클래스를 상속 받음 
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class DogDefault extends AnimalDefault { 
	DogDefault(){ //디폴트 생성자 : 입력 항목이 없고 생성자 내부에 아무 내용이 없는 생성자 
		
	}
	
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

public class DefaultConstructorExample {
	public static void main(String[] args) {
		DogDefault dog = new DogDefault(); //구현된 디폴트 생성자 실행 
	}

}

