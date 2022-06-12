package ThirdPackage;

//메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 떄문에 
//메소드가 객체의 속성값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지
class Updater {
	void update(Counter counter) { //Counter 객체를 전달 받음 
		counter.count++;
	}
}

class Counter {
	int count = 0; //객체 변수 
}

public class MethodExample5 {
	//Counter 클래스에 의해 생성된 객체 객체변수 count의 값을 Updater 클래스를 이용해 증가시키려고 시도 
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update : " + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter); //(myCounter.count)가 아님 
		System.out.println("after update : " + myCounter.count);
	}
	
}
