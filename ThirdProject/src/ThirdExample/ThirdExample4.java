package ThirdExample;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator4 {
	int value;
	
	Calculator4() {
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

public class ThirdExample4 {

	public static void main(String[] args) {
		Calculator4 cal = new Calculator4();
		
		int[] data1 = {1, 3, 5, 7, 9};
		int result = cal.avg(data1);
		System.out.println(result);
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		int result2 = cal.avg(data2);
		System.out.println(result2);

	}

}