package corejavaassignm.assignment1;

import java.util.ArrayList;
import java.util.List;

public class ListArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("List of all armstrong number");
		List<Integer> li = new ArrayList<>();
		for(int i=100;i<=999;i++) {
			if(isArmstrongNumber(i)) {
				li.add(i);
			}
		}
		System.out.println(li);
	}

	private static boolean isArmstrongNumber(int a) {
		int temp = a;
		int sum = 0,b;
		while(temp>0) {
			b = temp%10;
			sum = sum + b*b*b;
			temp = temp/10;
		}
		return a==sum;
	}

}
