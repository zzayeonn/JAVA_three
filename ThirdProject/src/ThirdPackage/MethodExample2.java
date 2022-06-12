package ThirdPackage;

public class MethodExample2 {
	//리턴자료형이 void인 경우에만 가능, 리턴자료형이 명시되어 있는 메소드에서 return문만 작성하면 컴파일 오류 발생
	void sayNick(String nick) { 
		if("fool".equals(nick)) {
			return; //메소드를 빠져나가기 원할 때 단독으로 사용하여 즉시 탈출 가능 
		}
		System.out.println("나의 별명은 " + nick + "입니다.");
	}

	public static void main(String[] args) {
		MethodExample2 sample = new MethodExample2();
		sample.sayNick("angel");
		sample.sayNick("fool"); //미출력 
	}

}
