import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


class starter {
public static void printArrayList(ArrayList<Integer> arr){
	for(int x = 0; x<arr.size();x++){
		System.out.println(arr.get(x));
	}
}
public static void addValuesArrayList(int n , ArrayList<Integer> arr){
	for(int y = 0; y<n; y++){
			arr.add(5);
	}

}

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" number:");
		int input  = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>(input);
		
		addValuesArrayList(input, a);
		printArrayList(a);


	}
}
