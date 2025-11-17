package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class InputOutputArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		In the following ways we can declare the array and intialize
//		1 . int[] num ; // only decleration 
//		2 . int[] num = new int[10]; decleration + alocate 
//		3 . int[] num = {10,20,30,40}; decleraion and initialize the values
//		4 . int[] num = new int[]{10,20,30,40}; using new keyword with the values
		
		
		int[] numArr = new int[] {10,20,30};
		
//		Initilization 
//		numArr[0] = sc.nextInt();
		
//		Retrive the data 
//		System.out.println(numArr[0]);
		
//		Initalization through loop
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("Enter the value for the "+i+ " index : ");
			numArr[i] = sc.nextInt();
		}
		
//		Retrive through loop
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}

}
