package ThirdPackage;

public class MethodExample {
	int sum(int a, int b) { //sum 메소드는 입력값은 두 개의 값(int 자료형 a, int 자료형 b) = 매개변수 
		return a + b; //리턴값은 두 개의 입력값을 더한 값(int 자료형)
	}

	public static void main(String[] args) {
		MethodExample sample = new MethodExample();
		int c = sample.sum(3, 4); //인수 
		
		System.out.println(c); //7 출력 
	}
	
	/*
	//입력값이 있고 리턴값이 있는 메소드 
	int sum(int a, int b) { //입력값 = int 자료형 a, int 자료형 b
		return a + b; //리턴값 = int 자료형
	}
	
	MethodExample sample = new MethodExample();
	int result = sample.sum(3,4); //리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
	
	//입력값이 없는 메소드
	String say() { //입력값 = 없음 
		return "Hi"; //리턴값 = String 자료형 
		
	MethodExample sample = new MethodExample();
	String a = sample.say(); //리턴값받을변수 = 객체.메소드명()
	System.out.println(a);
	
	//리턴값이 없는 메소드
	void sum(int a, int b) { //입력값 = int 자료형 a, int 자료형 b
		System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다."); //리턴값 = void(없음)
	}
	
	MethodExample sample = new MethodExample();
	sample.sum(3, 4); //객체.메소드명(입력인수1, 입력인수2, ...)
	
	//입력값도 리턴값도 없는 메소드 
	void say() { //입력값 = 없음 
		System.out.println("Hi"); //리턴값 = void(없음)
	}
	
	MethodExample sample = new MethodExample();
	sample.say(); //객체.메소드명()
	
	*/

}


