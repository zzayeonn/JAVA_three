package ThirdExample;

class Calculator6 {
	Integer value = 0; //Integer 자료형은 값을 대입하지 않을 경우 null 
	
	/*Calculator6() {
		this.value = 0;
	}*/
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}	
}

public class ThirdExample6 {

	public static void main(String[] args) {
		Calculator6 cal = new Calculator6();
		cal.add(3); //NullPointerException 발생 
		System.out.println(cal.getValue());

	}

}
