package ThirdPackage;

class Animals { //= class Animals extends Object, 모든 클래스는 Object 클래스를 상속 받음 
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animals { //extends : 클래스 상속을 위해 사용 
	//Dog 클래스에 객체변수 name과 setName 메소드를 만들지 않았지만 Animals 클래스를 상속했기 때문에 그대로 사용 가능 
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Dog dog = new Dog(); //= Object dog = new Dog(); = Dog is a Object
		dog.setName("Poppy");
		System.out.println(dog.name);
		dog.sleep();
	}

}
