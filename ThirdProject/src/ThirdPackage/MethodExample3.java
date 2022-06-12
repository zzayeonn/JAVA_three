package ThirdPackage;

public class MethodExample3 {
	int varTest(int a) { //로컬 변수 : 메소드 내에서만 쓰이는 변수 
		a++;
		return a; //2 출력
	}
	/*void varTest(int b) { //입력 인수인 변수 b는 varTest 메소드 안에서만 쓰이는 변수 
		b++; //1 출력 
	}*/
	public static void main(String[] args) {
		int a = 1;
		MethodExample3 sample = new MethodExample3();
		a = sample.varTest(a);
		System.out.println(a);

	}

}
