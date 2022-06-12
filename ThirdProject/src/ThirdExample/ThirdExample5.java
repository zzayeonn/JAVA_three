package ThirdExample;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator5 {
	int value;
	
	Calculator5() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}
	
	int avg(int[] data) {
		int sum = 0;
		for(int i = 0; i < data.length; i++) { //for(int i : data) {
			sum += data[i]; //sum += i;
		}
		return sum / data.length;
	}
	
	int avg(ArrayList<Integer> data) {
		int sum = 0;
		for(int j = 0; j < data.size(); j++) { //for(int j : data) {
			sum += data.get(j); //sum += j;
		}
		return sum / data.size();
	}
}

public class ThirdExample5 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> b = a; 
		//b 객체를 a 객체와 동일한 값을 가지지만 독립적으로 생성하고 싶다면 a 대신 new ArrayList<>(a)로 신규 객체 생성 
		a.add(4);
		System.out.println(b.size()); //4 출력, b와 a는 모두 동일한 리스트 객체를 가리키고 있음 
		System.out.println(a == b); //true 출력 

	}

}
