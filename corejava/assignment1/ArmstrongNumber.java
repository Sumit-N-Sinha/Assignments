package corejavaassignm.assignment1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int sum = 0,b;
		while(temp>0) {
			b = temp%10;
			sum = sum + b*b*b;
			temp = temp/10;
		}
		
		if(sum==a) {
			System.out.println(a+" is an armstrong number");
		}else {
			System.out.println(a+" is not an armstrong number");
		}
		sc.close();

	}

}
