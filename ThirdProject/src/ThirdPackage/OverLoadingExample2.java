package ThirdPackage;

//생성자 오버로딩 : 하나의 클래스에 입력 항목이 다른 생성자를 여러 개 만들 수 있음 
class AnimalLoadings {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class DogLoadings extends AnimalLoadings { 
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDogLoadings extends DogLoadings { //2개의 생성자 존재 
	HouseDogLoadings(String name){ //첫번째 생성자 
		this.setName(name);
	}
	
	HouseDogLoadings(int type){ //두번째 생성자 
		if (type == 1) {
			this.setName("yorkshire");
		} else if(type == 2) {
			this.setName("bulldog");
		}
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) { //void sleep(int 자료형) 메소드 추가
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}
}

public class OverLoadingExample2 {

	public static void main(String[] args) {
		HouseDogLoadings happy = new HouseDogLoadings("happy"); //문자열로 생성 
		HouseDogLoadings yorkshire = new HouseDogLoadings(1); //숫자값으로 생성 
		System.out.println(happy.name);
		System.out.println(yorkshire.name);
	}

}
