package ThirdPackage;

public class MethodExample4 {
	int a; //MethodExampl4 클래스의 객체변수로 선언 
	
	void varTest(MethodExample4 sample) { //MethodExampl4 클래스의 객체를 입력
		sample.a++; //해당 객체의 객체변수 a의 값을 1만큼 증가시키는 역할 
	}

	public static void main(String[] args) {
		MethodExample4 sample = new MethodExample4();
		sample.a = 1;
		sample.varTest(sample); //MethodExampl4 클래스의 객체인 sample 전달 받음
		System.out.println(sample.a);
	}
	
	//this 활용하기
	/*int a; //객체 변수 
	
	void varTest() {
		this.a++; //객체에 접근할 수 있게 해주는 this
	}
	
	public static void main(String[] args) {
		MethodExample4 sample = new MethodExample4();
		sample.a = 1;
		sample.varTest(); //this 덕분에 (sample) 객체를 이용하여 varTest 메소드 호출 미필요 
		System.out.println(sample.a);
	}*/
}
