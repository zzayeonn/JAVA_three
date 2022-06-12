package ThirdExample;

class Calculator3 {
	int value;
	
	Calculator3() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}
	
	void isOdd(int num) {
		if(num % 2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	/*boolean isOdd(int num) {
		return num % 2 == 1;
	}*/
	
}

public class ThirdExample3 {

	public static void main(String[] args) {
		Calculator3 cal = new Calculator3();
		cal.isOdd(3);
		cal.isOdd(4);
		/*System.out.println(cal.isOdd(3));
		System.out.println(cal.isOdd(4));*/

	}

}
