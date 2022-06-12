package ThirdPackage;

class Animal {
	String name; //객체 변수(클래스 내에 선언된 변수) 선언 
	
	public void setName(String name) {
		this.name = name; //this는 Animal 클래스에 의해 생성된 객체를 지칭 = cat.name = "boby"
	}
}

public class ClassExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal(); //cat(객체) 생성 = Animal의 인스턴스 
		cat.setName("boby"); //(객체.메소드)로 setName 메소드 호출 
		
		//객체 변수는 미공유, 객체 변수의 값은 독립적으로 유지 = 객체 지향적 
		Animal dog = new Animal();
		dog.setName("happy");
		
		System.out.println(cat.name); //(객체.객체변수)로 접근 
		System.out.println(dog.name);
	}

}
