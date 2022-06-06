import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void toStringArray(ArrayList<Integer>arr){
		for(int x = 0; x<arr.size();x++){
			System.out.print(arr.get(x)+" ");
		}
	}
	public static int getArrayListAverage(ArrayList <Integer> arr){
		int sum = 0;
		// int c = 0; 
		for(int x = 0; x< arr.size();x++){
			sum = sum+ arr.get(x);
		}
		int total  = sum/ arr.size();
		return total;
	}
	public static int getArrayListMax(ArrayList<Integer> arr){
		int Max = 0;
		for(int x = 0; x<arr.size(); x++){
		if(Max<arr.get(x)){
			Max = arr.get(x);
		}	
		}
		return Max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr){
		int Min = 100;
		for(int x = 0;x< arr.size(); x++){
			if(Min>arr.get(x)){
				Min= arr.get(x);
			}
		}
		return Min ;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System .out.println("pick a number: ");
	int input = sc.nextInt();
	ArrayList<Integer> arr = new ArrayList<Integer>(input);
	//gives random values to arr list 
	for(int x = 0;x< input;x++){
		arr.add(x,(int)(1+Math.random()*100));
		
	}
	toStringArray(arr);
	System.out.println();
		System.out.println("max"+getArrayListMax(arr));
		System.out.println("Min"+getArrayListMin(arr));
		System.out.println("Avg"+getArrayListAverage(arr));	

		
	}
}
