package ThirdPackage;

//메소드 오버로딩 : 입력항목이 다를 경우 동일한 이름의 메소드를 만들 수 있음 
class AnimalLoading {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class DogLoading extends AnimalLoading { 
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDogLoading extends DogLoading { 
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) { //void sleep(int 자료형) 메소드 추가
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}
}

public class OverLoadingExample {

	public static void main(String[] args) {
		HouseDogLoading housedog = new HouseDogLoading(); 
		housedog.setName("happy");
		housedog.sleep(); 
		housedog.sleep(3); 
	}

}
